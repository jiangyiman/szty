/*
 * jQuery UI Draggable 1.7.2
 *
 * Copyright (c) 2009 AUTHORS.txt (http://jqueryui.com/about)
 * Dual licensed under the MIT (MIT-LICENSE.txt)
 * and GPL (GPL-LICENSE.txt) licenses.
 *
 * http://docs.jquery.com/UI/Draggables
 *
 * Depends:
 *	ui.core.js
 */
(function(a) {
	a
			.widget(
					"ui.draggable",
					a
							.extend(
									{},
									a.ui.mouse,
									{
										_init : function() {
											if (this.options.helper == "original"
													&& !(/^(?:r|a|f)/)
															.test(this.element
																	.css("position"))) {
												this.element[0].style.position = "relative"
											}
											(this.options.addClasses && this.element
													.addClass("ui-draggable"));
											(this.options.disabled && this.element
													.addClass("ui-draggable-disabled"));
											this._mouseInit()
										},
										destroy : function() {
											if (!this.element.data("draggable")) {
												return
											}
											this.element
													.removeData("draggable")
													.unbind(".draggable")
													.removeClass(
															"ui-draggable ui-draggable-dragging ui-draggable-disabled");
											this._mouseDestroy()
										},
										_mouseCapture : function(b) {
											var c = this.options;
											if (this.helper
													|| c.disabled
													|| a(b.target)
															.is(
																	".ui-resizable-handle")) {
												return false
											}
											this.handle = this._getHandle(b);
											if (!this.handle) {
												return false
											}
											return true
										},
										_mouseStart : function(b) {
											var c = this.options;
											this.helper = this._createHelper(b);
											this._cacheHelperProportions();
											if (a.ui.ddmanager) {
												a.ui.ddmanager.current = this
											}
											this._cacheMargins();
											this.cssPosition = this.helper
													.css("position");
											this.scrollParent = this.helper
													.scrollParent();
											this.offset = this.element.offset();
											this.offset = {
												top : this.offset.top
														- this.margins.top,
												left : this.offset.left
														- this.margins.left
											};
											a.extend(this.offset, {
												click : {
													left : b.pageX
															- this.offset.left,
													top : b.pageY
															- this.offset.top
												},
												parent : this
														._getParentOffset(),
												relative : this
														._getRelativeOffset()
											});
											this.originalPosition = this
													._generatePosition(b);
											this.originalPageX = b.pageX;
											this.originalPageY = b.pageY;
											if (c.cursorAt) {
												this
														._adjustOffsetFromHelper(c.cursorAt)
											}
											if (c.containment) {
												this._setContainment()
											}
											this._trigger("start", b);
											this._cacheHelperProportions();
											if (a.ui.ddmanager
													&& !c.dropBehaviour) {
												a.ui.ddmanager.prepareOffsets(
														this, b)
											}
											this.helper
													.addClass("ui-draggable-dragging");
											this._mouseDrag(b, true);
											return true
										},
										_mouseDrag : function(b, d) {
											this.position = this
													._generatePosition(b);
											this.positionAbs = this
													._convertPositionTo("absolute");
											if (!d) {
												var c = this._uiHash();
												this._trigger("drag", b, c);
												this.position = c.position
											}
											if (!this.options.axis
													|| this.options.axis != "y") {
												this.helper[0].style.left = this.position.left
														+ "px"
											}
											if (!this.options.axis
													|| this.options.axis != "x") {
												this.helper[0].style.top = this.position.top
														+ "px"
											}
											if (a.ui.ddmanager) {
												a.ui.ddmanager.drag(this, b)
											}
											return false
										},
										_mouseStop : function(c) {
											var d = false;
											if (a.ui.ddmanager
													&& !this.options.dropBehaviour) {
												d = a.ui.ddmanager
														.drop(this, c)
											}
											if (this.dropped) {
												d = this.dropped;
												this.dropped = false
											}
											if ((this.options.revert == "invalid" && !d)
													|| (this.options.revert == "valid" && d)
													|| this.options.revert === true
													|| (a
															.isFunction(this.options.revert) && this.options.revert
															.call(this.element,
																	d))) {
												var b = this;
												a(this.helper)
														.animate(
																this.originalPosition,
																parseInt(
																		this.options.revertDuration,
																		10),
																function() {
																	b
																			._trigger(
																					"stop",
																					c);
																	b._clear()
																})
											} else {
												this._trigger("stop", c);
												this._clear()
											}
											return false
										},
										_getHandle : function(b) {
											var c = !this.options.handle
													|| !a(this.options.handle,
															this.element).length ? true
													: false;
											a(this.options.handle, this.element)
													.find("*").andSelf()
													.each(function() {
														if (this == b.target) {
															c = true
														}
													});
											return c
										},
										_createHelper : function(c) {
											var d = this.options;
											var b = a.isFunction(d.helper) ? a(d.helper
													.apply(this.element[0],
															[ c ]))
													: (d.helper == "clone" ? this.element
															.clone()
															: this.element);
											if (!b.parents("body").length) {
												b
														.appendTo((d.appendTo == "parent" ? this.element[0].parentNode
																: d.appendTo))
											}
											if (b[0] != this.element[0]
													&& !(/(fixed|absolute)/)
															.test(b
																	.css("position"))) {
												b.css("position", "absolute")
											}
											return b
										},
										_adjustOffsetFromHelper : function(b) {
											if (b.left != undefined) {
												this.offset.click.left = b.left
														+ this.margins.left
											}
											if (b.right != undefined) {
												this.offset.click.left = this.helperProportions.width
														- b.right
														+ this.margins.left
											}
											if (b.top != undefined) {
												this.offset.click.top = b.top
														+ this.margins.top
											}
											if (b.bottom != undefined) {
												this.offset.click.top = this.helperProportions.height
														- b.bottom
														+ this.margins.top
											}
										},
										_getParentOffset : function() {
											this.offsetParent = this.helper
													.offsetParent();
											var b = this.offsetParent.offset();
											if (this.cssPosition == "absolute"
													&& this.scrollParent[0] != document
													&& a.ui
															.contains(
																	this.scrollParent[0],
																	this.offsetParent[0])) {
												b.left += this.scrollParent
														.scrollLeft();
												b.top += this.scrollParent
														.scrollTop()
											}
											if ((this.offsetParent[0] == document.body)
													|| (this.offsetParent[0].tagName
															&& this.offsetParent[0].tagName
																	.toLowerCase() == "html" && a.browser.msie)) {
												b = {
													top : 0,
													left : 0
												}
											}
											return {
												top : b.top
														+ (parseInt(
																this.offsetParent
																		.css("borderTopWidth"),
																10) || 0),
												left : b.left
														+ (parseInt(
																this.offsetParent
																		.css("borderLeftWidth"),
																10) || 0)
											}
										},
										_getRelativeOffset : function() {
											if (this.cssPosition == "relative") {
												var b = this.element.position();
												return {
													top : b.top
															- (parseInt(
																	this.helper
																			.css("top"),
																	10) || 0)
															+ this.scrollParent
																	.scrollTop(),
													left : b.left
															- (parseInt(
																	this.helper
																			.css("left"),
																	10) || 0)
															+ this.scrollParent
																	.scrollLeft()
												}
											} else {
												return {
													top : 0,
													left : 0
												}
											}
										},
										_cacheMargins : function() {
											this.margins = {
												left : (parseInt(this.element
														.css("marginLeft"), 10) || 0),
												top : (parseInt(this.element
														.css("marginTop"), 10) || 0)
											}
										},
										_cacheHelperProportions : function() {
											this.helperProportions = {
												width : this.helper
														.outerWidth(),
												height : this.helper
														.outerHeight()
											}
										},
										_setContainment : function() {
											var e = this.options;
											if (e.containment == "parent") {
												e.containment = this.helper[0].parentNode
											}
											if (e.containment == "document"
													|| e.containment == "window") {
												this.containment = [
														0
																- this.offset.relative.left
																- this.offset.parent.left,
														0
																- this.offset.relative.top
																- this.offset.parent.top,
														a(
																e.containment == "document" ? document
																		: window)
																.width()
																- this.helperProportions.width
																- this.margins.left,
														(a(
																e.containment == "document" ? document
																		: window)
																.height() || document.body.parentNode.scrollHeight)
																- this.helperProportions.height
																- this.margins.top ]
											}
											if (!(/^(document|window|parent)$/)
													.test(e.containment)
													&& e.containment.constructor != Array) {
												var c = a(e.containment)[0];
												if (!c) {
													return
												}
												var d = a(e.containment)
														.offset();
												var b = (a(c).css("overflow") != "hidden");
												this.containment = [
														d.left
																+ (parseInt(
																		a(c)
																				.css(
																						"borderLeftWidth"),
																		10) || 0)
																+ (parseInt(
																		a(c)
																				.css(
																						"paddingLeft"),
																		10) || 0)
																- this.margins.left,
														d.top
																+ (parseInt(
																		a(c)
																				.css(
																						"borderTopWidth"),
																		10) || 0)
																+ (parseInt(
																		a(c)
																				.css(
																						"paddingTop"),
																		10) || 0)
																- this.margins.top,
														d.left
																+ (b ? Math
																		.max(
																				c.scrollWidth,
																				c.offsetWidth)
																		: c.offsetWidth)
																- (parseInt(
																		a(c)
																				.css(
																						"borderLeftWidth"),
																		10) || 0)
																- (parseInt(
																		a(c)
																				.css(
																						"paddingRight"),
																		10) || 0)
																- this.helperProportions.width
																- this.margins.left,
														d.top
																+ (b ? Math
																		.max(
																				c.scrollHeight,
																				c.offsetHeight)
																		: c.offsetHeight)
																- (parseInt(
																		a(c)
																				.css(
																						"borderTopWidth"),
																		10) || 0)
																- (parseInt(
																		a(c)
																				.css(
																						"paddingBottom"),
																		10) || 0)
																- this.helperProportions.height
																- this.margins.top ]
											} else {
												if (e.containment.constructor == Array) {
													this.containment = e.containment
												}
											}
										},
										_convertPositionTo : function(f, h) {
											if (!h) {
												h = this.position
											}
											var c = f == "absolute" ? 1 : -1;
											var e = this.options, b = this.cssPosition == "absolute"
													&& !(this.scrollParent[0] != document && a.ui
															.contains(
																	this.scrollParent[0],
																	this.offsetParent[0])) ? this.offsetParent
													: this.scrollParent, g = (/(html|body)/i)
													.test(b[0].tagName);
											return {
												top : (h.top
														+ this.offset.relative.top
														* c
														+ this.offset.parent.top
														* c - (a.browser.safari
														&& this.cssPosition == "fixed" ? 0
														: (this.cssPosition == "fixed" ? -this.scrollParent
																.scrollTop()
																: (g ? 0
																		: b
																				.scrollTop()))
																* c)),
												left : (h.left
														+ this.offset.relative.left
														* c
														+ this.offset.parent.left
														* c - (a.browser.safari
														&& this.cssPosition == "fixed" ? 0
														: (this.cssPosition == "fixed" ? -this.scrollParent
																.scrollLeft()
																: g ? 0
																		: b
																				.scrollLeft())
																* c))
											}
										},
										_generatePosition : function(e) {
											var h = this.options, b = this.cssPosition == "absolute"
													&& !(this.scrollParent[0] != document && a.ui
															.contains(
																	this.scrollParent[0],
																	this.offsetParent[0])) ? this.offsetParent
													: this.scrollParent, i = (/(html|body)/i)
													.test(b[0].tagName);
											if (this.cssPosition == "relative"
													&& !(this.scrollParent[0] != document && this.scrollParent[0] != this.offsetParent[0])) {
												this.offset.relative = this
														._getRelativeOffset()
											}
											var d = e.pageX;
											var c = e.pageY;
											if (this.originalPosition) {
												if (this.containment) {
													if (e.pageX
															- this.offset.click.left < this.containment[0]) {
														d = this.containment[0]
																+ this.offset.click.left
													}
													if (e.pageY
															- this.offset.click.top < this.containment[1]) {
														c = this.containment[1]
																+ this.offset.click.top
													}
													if (e.pageX
															- this.offset.click.left > this.containment[2]) {
														d = this.containment[2]
																+ this.offset.click.left
													}
													if (e.pageY
															- this.offset.click.top > this.containment[3]) {
														c = this.containment[3]
																+ this.offset.click.top
													}
												}
												if (h.grid) {
													var g = this.originalPageY
															+ Math
																	.round((c - this.originalPageY)
																			/ h.grid[1])
															* h.grid[1];
													c = this.containment ? (!(g
															- this.offset.click.top < this.containment[1] || g
															- this.offset.click.top > this.containment[3]) ? g
															: (!(g
																	- this.offset.click.top < this.containment[1]) ? g
																	- h.grid[1]
																	: g
																			+ h.grid[1]))
															: g;
													var f = this.originalPageX
															+ Math
																	.round((d - this.originalPageX)
																			/ h.grid[0])
															* h.grid[0];
													d = this.containment ? (!(f
															- this.offset.click.left < this.containment[0] || f
															- this.offset.click.left > this.containment[2]) ? f
															: (!(f
																	- this.offset.click.left < this.containment[0]) ? f
																	- h.grid[0]
																	: f
																			+ h.grid[0]))
															: f
												}
											}
											return {
												top : (c
														- this.offset.click.top
														- this.offset.relative.top
														- this.offset.parent.top + (a.browser.safari
														&& this.cssPosition == "fixed" ? 0
														: (this.cssPosition == "fixed" ? -this.scrollParent
																.scrollTop()
																: (i ? 0
																		: b
																				.scrollTop())))),
												left : (d
														- this.offset.click.left
														- this.offset.relative.left
														- this.offset.parent.left + (a.browser.safari
														&& this.cssPosition == "fixed" ? 0
														: (this.cssPosition == "fixed" ? -this.scrollParent
																.scrollLeft()
																: i ? 0
																		: b
																				.scrollLeft())))
											}
										},
										_clear : function() {
											this.helper
													.removeClass("ui-draggable-dragging");
											if (this.helper[0] != this.element[0]
													&& !this.cancelHelperRemoval) {
												this.helper.remove()
											}
											this.helper = null;
											this.cancelHelperRemoval = false
										},
										_trigger : function(b, c, d) {
											d = d || this._uiHash();
											a.ui.plugin.call(this, b, [ c, d ]);
											if (b == "drag") {
												this.positionAbs = this
														._convertPositionTo("absolute")
											}
											return a.widget.prototype._trigger
													.call(this, b, c, d)
										},
										plugins : {},
										_uiHash : function(b) {
											return {
												helper : this.helper,
												position : this.position,
												absolutePosition : this.positionAbs,
												offset : this.positionAbs
											}
										}
									}));
	a.extend(a.ui.draggable, {
		version : "1.7.2",
		eventPrefix : "drag",
		defaults : {
			addClasses : true,
			appendTo : "parent",
			axis : false,
			cancel : ":input,option",
			connectToSortable : false,
			containment : false,
			cursor : "auto",
			cursorAt : false,
			delay : 0,
			distance : 1,
			grid : false,
			handle : false,
			helper : "original",
			iframeFix : false,
			opacity : false,
			refreshPositions : false,
			revert : false,
			revertDuration : 500,
			scope : "default",
			scroll : true,
			scrollSensitivity : 20,
			scrollSpeed : 20,
			snap : false,
			snapMode : "both",
			snapTolerance : 20,
			stack : false,
			zIndex : false
		}
	});
	a.ui.plugin
			.add(
					"draggable",
					"connectToSortable",
					{
						start : function(c, e) {
							var d = a(this).data("draggable"), f = d.options, b = a
									.extend({}, e, {
										item : d.element
									});
							d.sortables = [];
							a(f.connectToSortable).each(function() {
								var g = a.data(this, "sortable");
								if (g && !g.options.disabled) {
									d.sortables.push({
										instance : g,
										shouldRevert : g.options.revert
									});
									g._refreshItems();
									g._trigger("activate", c, b)
								}
							})
						},
						stop : function(c, e) {
							var d = a(this).data("draggable"), b = a.extend({},
									e, {
										item : d.element
									});
							a
									.each(
											d.sortables,
											function() {
												if (this.instance.isOver) {
													this.instance.isOver = 0;
													d.cancelHelperRemoval = true;
													this.instance.cancelHelperRemoval = false;
													if (this.shouldRevert) {
														this.instance.options.revert = true
													}
													this.instance._mouseStop(c);
													this.instance.options.helper = this.instance.options._helper;
													if (d.options.helper == "original") {
														this.instance.currentItem
																.css({
																	top : "auto",
																	left : "auto"
																})
													}
												} else {
													this.instance.cancelHelperRemoval = false;
													this.instance._trigger(
															"deactivate", c, b)
												}
											})
						},
						drag : function(c, f) {
							var e = a(this).data("draggable"), b = this;
							var d = function(i) {
								var n = this.offset.click.top, m = this.offset.click.left;
								var g = this.positionAbs.top, k = this.positionAbs.left;
								var j = i.height, l = i.width;
								var p = i.top, h = i.left;
								return a.ui.isOver(g + n, k + m, p, h, j, l)
							};
							a
									.each(
											e.sortables,
											function(g) {
												this.instance.positionAbs = e.positionAbs;
												this.instance.helperProportions = e.helperProportions;
												this.instance.offset.click = e.offset.click;
												if (this.instance
														._intersectsWith(this.instance.containerCache)) {
													if (!this.instance.isOver) {
														this.instance.isOver = 1;
														this.instance.currentItem = a(
																b)
																.clone()
																.appendTo(
																		this.instance.element)
																.data(
																		"sortable-item",
																		true);
														this.instance.options._helper = this.instance.options.helper;
														this.instance.options.helper = function() {
															return f.helper[0]
														};
														c.target = this.instance.currentItem[0];
														this.instance
																._mouseCapture(
																		c, true);
														this.instance
																._mouseStart(c,
																		true,
																		true);
														this.instance.offset.click.top = e.offset.click.top;
														this.instance.offset.click.left = e.offset.click.left;
														this.instance.offset.parent.left -= e.offset.parent.left
																- this.instance.offset.parent.left;
														this.instance.offset.parent.top -= e.offset.parent.top
																- this.instance.offset.parent.top;
														e
																._trigger(
																		"toSortable",
																		c);
														e.dropped = this.instance.element;
														e.currentItem = e.element;
														this.instance.fromOutside = e
													}
													if (this.instance.currentItem) {
														this.instance
																._mouseDrag(c)
													}
												} else {
													if (this.instance.isOver) {
														this.instance.isOver = 0;
														this.instance.cancelHelperRemoval = true;
														this.instance.options.revert = false;
														this.instance
																._trigger(
																		"out",
																		c,
																		this.instance
																				._uiHash(this.instance));
														this.instance
																._mouseStop(c,
																		true);
														this.instance.options.helper = this.instance.options._helper;
														this.instance.currentItem
																.remove();
														if (this.instance.placeholder) {
															this.instance.placeholder
																	.remove()
														}
														e._trigger(
																"fromSortable",
																c);
														e.dropped = false
													}
												}
											})
						}
					});
	a.ui.plugin.add("draggable", "cursor", {
		start : function(c, d) {
			var b = a("body"), e = a(this).data("draggable").options;
			if (b.css("cursor")) {
				e._cursor = b.css("cursor")
			}
			b.css("cursor", e.cursor)
		},
		stop : function(b, c) {
			var d = a(this).data("draggable").options;
			if (d._cursor) {
				a("body").css("cursor", d._cursor)
			}
		}
	});
	a.ui.plugin
			.add(
					"draggable",
					"iframeFix",
					{
						start : function(b, c) {
							var d = a(this).data("draggable").options;
							a(d.iframeFix === true ? "iframe" : d.iframeFix)
									.each(
											function() {
												a(
														'<div class="ui-draggable-iframeFix" style="background: #fff;"></div>')
														.css(
																{
																	width : this.offsetWidth
																			+ "px",
																	height : this.offsetHeight
																			+ "px",
																	position : "absolute",
																	opacity : "0.001",
																	zIndex : 1000
																})
														.css(a(this).offset())
														.appendTo("body")
											})
						},
						stop : function(b, c) {
							a("div.ui-draggable-iframeFix").each(function() {
								this.parentNode.removeChild(this)
							})
						}
					});
	a.ui.plugin.add("draggable", "opacity", {
		start : function(c, d) {
			var b = a(d.helper), e = a(this).data("draggable").options;
			if (b.css("opacity")) {
				e._opacity = b.css("opacity")
			}
			b.css("opacity", e.opacity)
		},
		stop : function(b, c) {
			var d = a(this).data("draggable").options;
			if (d._opacity) {
				a(c.helper).css("opacity", d._opacity)
			}
		}
	});
	a.ui.plugin
			.add(
					"draggable",
					"scroll",
					{
						start : function(c, d) {
							var b = a(this).data("draggable");
							if (b.scrollParent[0] != document
									&& b.scrollParent[0].tagName != "HTML") {
								b.overflowOffset = b.scrollParent.offset()
							}
						},
						drag : function(d, e) {
							var c = a(this).data("draggable"), f = c.options, b = false;
							if (c.scrollParent[0] != document
									&& c.scrollParent[0].tagName != "HTML") {
								if (!f.axis || f.axis != "x") {
									if ((c.overflowOffset.top + c.scrollParent[0].offsetHeight)
											- d.pageY < f.scrollSensitivity) {
										c.scrollParent[0].scrollTop = b = c.scrollParent[0].scrollTop
												+ f.scrollSpeed
									} else {
										if (d.pageY - c.overflowOffset.top < f.scrollSensitivity) {
											c.scrollParent[0].scrollTop = b = c.scrollParent[0].scrollTop
													- f.scrollSpeed
										}
									}
								}
								if (!f.axis || f.axis != "y") {
									if ((c.overflowOffset.left + c.scrollParent[0].offsetWidth)
											- d.pageX < f.scrollSensitivity) {
										c.scrollParent[0].scrollLeft = b = c.scrollParent[0].scrollLeft
												+ f.scrollSpeed
									} else {
										if (d.pageX - c.overflowOffset.left < f.scrollSensitivity) {
											c.scrollParent[0].scrollLeft = b = c.scrollParent[0].scrollLeft
													- f.scrollSpeed
										}
									}
								}
							} else {
								if (!f.axis || f.axis != "x") {
									if (d.pageY - a(document).scrollTop() < f.scrollSensitivity) {
										b = a(document).scrollTop(
												a(document).scrollTop()
														- f.scrollSpeed)
									} else {
										if (a(window).height()
												- (d.pageY - a(document)
														.scrollTop()) < f.scrollSensitivity) {
											b = a(document).scrollTop(
													a(document).scrollTop()
															+ f.scrollSpeed)
										}
									}
								}
								if (!f.axis || f.axis != "y") {
									if (d.pageX - a(document).scrollLeft() < f.scrollSensitivity) {
										b = a(document).scrollLeft(
												a(document).scrollLeft()
														- f.scrollSpeed)
									} else {
										if (a(window).width()
												- (d.pageX - a(document)
														.scrollLeft()) < f.scrollSensitivity) {
											b = a(document).scrollLeft(
													a(document).scrollLeft()
															+ f.scrollSpeed)
										}
									}
								}
							}
							if (b !== false && a.ui.ddmanager
									&& !f.dropBehaviour) {
								a.ui.ddmanager.prepareOffsets(c, d)
							}
						}
					});
	a.ui.plugin
			.add(
					"draggable",
					"snap",
					{
						start : function(c, d) {
							var b = a(this).data("draggable"), e = b.options;
							b.snapElements = [];
							a(
									e.snap.constructor != String ? (e.snap.items || ":data(draggable)")
											: e.snap).each(function() {
								var g = a(this);
								var f = g.offset();
								if (this != b.element[0]) {
									b.snapElements.push({
										item : this,
										width : g.outerWidth(),
										height : g.outerHeight(),
										top : f.top,
										left : f.left
									})
								}
							})
						},
						drag : function(u, p) {
							var g = a(this).data("draggable"), q = g.options;
							var y = q.snapTolerance;
							var x = p.offset.left, w = x
									+ g.helperProportions.width, f = p.offset.top, e = f
									+ g.helperProportions.height;
							for ( var v = g.snapElements.length - 1; v >= 0; v--) {
								var s = g.snapElements[v].left, n = s
										+ g.snapElements[v].width, m = g.snapElements[v].top, A = m
										+ g.snapElements[v].height;
								if (!((s - y < x && x < n + y && m - y < f && f < A
										+ y)
										|| (s - y < x && x < n + y && m - y < e && e < A
												+ y)
										|| (s - y < w && w < n + y && m - y < f && f < A
												+ y) || (s - y < w && w < n + y
										&& m - y < e && e < A + y))) {
									if (g.snapElements[v].snapping) {
										(g.options.snap.release && g.options.snap.release
												.call(
														g.element,
														u,
														a
																.extend(
																		g
																				._uiHash(),
																		{
																			snapItem : g.snapElements[v].item
																		})))
									}
									g.snapElements[v].snapping = false;
									continue
								}
								if (q.snapMode != "inner") {
									var c = Math.abs(m - e) <= y;
									var z = Math.abs(A - f) <= y;
									var j = Math.abs(s - w) <= y;
									var k = Math.abs(n - x) <= y;
									if (c) {
										p.position.top = g
												._convertPositionTo(
														"relative",
														{
															top : m
																	- g.helperProportions.height,
															left : 0
														}).top
												- g.margins.top
									}
									if (z) {
										p.position.top = g._convertPositionTo(
												"relative", {
													top : A,
													left : 0
												}).top
												- g.margins.top
									}
									if (j) {
										p.position.left = g
												._convertPositionTo(
														"relative",
														{
															top : 0,
															left : s
																	- g.helperProportions.width
														}).left
												- g.margins.left
									}
									if (k) {
										p.position.left = g._convertPositionTo(
												"relative", {
													top : 0,
													left : n
												}).left
												- g.margins.left
									}
								}
								var h = (c || z || j || k);
								if (q.snapMode != "outer") {
									var c = Math.abs(m - f) <= y;
									var z = Math.abs(A - e) <= y;
									var j = Math.abs(s - x) <= y;
									var k = Math.abs(n - w) <= y;
									if (c) {
										p.position.top = g._convertPositionTo(
												"relative", {
													top : m,
													left : 0
												}).top
												- g.margins.top
									}
									if (z) {
										p.position.top = g
												._convertPositionTo(
														"relative",
														{
															top : A
																	- g.helperProportions.height,
															left : 0
														}).top
												- g.margins.top
									}
									if (j) {
										p.position.left = g._convertPositionTo(
												"relative", {
													top : 0,
													left : s
												}).left
												- g.margins.left
									}
									if (k) {
										p.position.left = g
												._convertPositionTo(
														"relative",
														{
															top : 0,
															left : n
																	- g.helperProportions.width
														}).left
												- g.margins.left
									}
								}
								if (!g.snapElements[v].snapping
										&& (c || z || j || k || h)) {
									(g.options.snap.snap && g.options.snap.snap
											.call(
													g.element,
													u,
													a
															.extend(
																	g._uiHash(),
																	{
																		snapItem : g.snapElements[v].item
																	})))
								}
								g.snapElements[v].snapping = (c || z || j || k || h)
							}
						}
					});
	a.ui.plugin
			.add(
					"draggable",
					"stack",
					{
						start : function(b, c) {
							var e = a(this).data("draggable").options;
							var d = a
									.makeArray(a(e.stack.group))
									.sort(
											function(g, f) {
												return (parseInt(a(g).css(
														"zIndex"), 10) || e.stack.min)
														- (parseInt(a(f).css(
																"zIndex"), 10) || e.stack.min)
											});
							a(d).each(function(f) {
								this.style.zIndex = e.stack.min + f
							});
							this[0].style.zIndex = e.stack.min + d.length
						}
					});
	a.ui.plugin.add("draggable", "zIndex", {
		start : function(c, d) {
			var b = a(d.helper), e = a(this).data("draggable").options;
			if (b.css("zIndex")) {
				e._zIndex = b.css("zIndex")
			}
			b.css("zIndex", e.zIndex)
		},
		stop : function(b, c) {
			var d = a(this).data("draggable").options;
			if (d._zIndex) {
				a(c.helper).css("zIndex", d._zIndex)
			}
		}
	})
})(jQuery);