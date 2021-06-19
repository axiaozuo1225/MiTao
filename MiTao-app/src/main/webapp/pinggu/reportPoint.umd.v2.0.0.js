!function(e,t){"object"==typeof exports&&"undefined"!=typeof module?t(exports):"function"==typeof define&&define.amd?define(["exports"],t):t(e.ReportPoint={})}(this,function(e){"use strict";var i={env:"production",failureQueueCount:5,failureReportRate:1e4,user_id:"",openid:"",appkey:"",apps:{},api:"https://bi-sdk.huishoubao.com/report_api/v1/report"};var t,o=(function(t){function n(e){return(n="function"==typeof Symbol&&"symbol"==typeof Symbol.iterator?function(e){return typeof e}:function(e){return e&&"function"==typeof Symbol&&e.constructor===Symbol&&e!==Symbol.prototype?"symbol":typeof e})(e)}function r(e){return"function"==typeof Symbol&&"symbol"===n(Symbol.iterator)?t.exports=r=function(e){return n(e)}:t.exports=r=function(e){return e&&"function"==typeof Symbol&&e.constructor===Symbol&&e!==Symbol.prototype?"symbol":n(e)},r(e)}t.exports=r}(t={exports:{}},t.exports),t.exports),a=function(e,t){var n=0<arguments.length&&void 0!==e?e:"",r=1<arguments.length&&void 0!==t?t:{};if(n){var i=function(){var t;if(window.XMLHttpRequest)(t=new XMLHttpRequest).overrideMimeType&&t.overrideMimeType("text/xml");else if(window.ActiveXObject)try{t=new ActiveXObject("Msxml2.XMLHTTP")}catch(e){t=new ActiveXObject("Microsoft.XMLHTTP")}return t}(),o=!1!==r.async;return o&&(i.timeout=3e4),i.open("POST",n,o),i.setRequestHeader("Content-Type","application/json; charset=UTF-8"),i.send(JSON.stringify(r.data)),i.onreadystatechange=function(){4===i.readyState&&200===i.status&&r.success&&r.success(i.responseText)},i}},n="";"undefined"!=typeof window&&(n=window.navigator.userAgent);var r={};r.ua=n,r.isFireFox=/(?:Firefox)/.test(n),r.isWindowsPhone=/(?:Windows Phone)/.test(n),r.isSymbian=/(?:SymbianOS)/.test(n)||r.isWindowsPhone,r.isIOS=/iPad|iPhone|iPod/i.test(n),r.isAndroid=/android/i.test(n),r.isTablet=/(?:iPad|PlayBook)/.test(n)||r.isAndroid&&!/(?:Mobile)/.test(n)||r.isFireFox&&/(?:Tablet)/.test(n),r.isUc=/ucweb/i.test(n),r.isWindowsCe=/windows ce/i.test(n),r.isWindowsMobile=/windows mobile/i.test(n),r.isWechat=/micromessenger/i.test(n),r.isAlipay=/alipay/i.test(n),r.isCola=/hsb_app_klyp/i.test(n),r.isZiyou=/hsb_app_huishoubao/i.test(n),r.getAppName=function(){return r.isCola?"cola":r.isZiyou?"ziyou":"cola"},r.isPc=function(){return!r.isSymbian&&!r.isAndroid&&!r.isIOS},r.isApp=function(){return r.isCola||r.isZiyou},r.isH5=function(){return r.isIOS||r.isAndroid},r.isWechatH5=function(){return r.isWechat},r.isWechatMiniProgram=function(){return!1},r.isAlipayH5=function(){return r.isAlipay},r.isAlipayMiniProgram=function(){return!1},r.getPlatform=function(){return r.isIOS?"ios":r.isAndroid?"android":r.isAlipay?"alipay_h5":r.isWechat?"wechat_h5":r.isWechatMiniProgram()?"wechat_xiaochengxu":r.isAlipayMiniProgram()?"alipay_xiaochengxu":r.isPc()?"pc":void 0},r.getDeviceType=function(){return r.isTablet?"平板":r.isH5()?"手机":r.isPc()?"电脑":void 0},r.getDeviceBrand=function(){var e=r.ua.indexOf("("),t=r.ua.indexOf(")"),n=r.ua.slice(e,t);n=n.split("; ")};function u(e,t,n,r){var i=0<arguments.length&&void 0!==e?e:"",o=1<arguments.length&&void 0!==t?t:"",a=2<arguments.length&&void 0!==n?n:"",s=3<arguments.length&&void 0!==r?r:"",c=window.location,u=c.origin,d=c.pathname,l=c.search,f="".concat(u+d+l);return"hash"===a&&(i="".concat(f+"#"+i),o=o&&"".concat(f+"#"+o)),"history"===a&&(i="".concat(u+s+i),o=o&&"".concat(u+s+o)),{cur:encodeURIComponent(i),prev:encodeURIComponent(o)}}var s=function(e){var t=0<arguments.length&&void 0!==e?e:10;return t<=0&&(t=-1),(Number(Math.random().toString().substr(2)).toString(36)+Date.now().toString(16)).slice(0,t)},c=function(e,t){var n=0<arguments.length&&void 0!==e?e:{},r=1<arguments.length&&void 0!==t?t:{};for(var i in n)void 0!==r[i]&&(n[i]=r[i]);return n},d={expire:function(e,t){var n;e="expire-"+e,t=t||1,d.get(e)||(t=1e3*t*60*60,n=+new Date+t,d.add(e,n))},checkExpire:function(){"undefined"!=typeof localStorage&&Object.keys(localStorage).forEach(function(e){if(-1<e.indexOf("expire-")){var t=d.get(e);+new Date>t&&(d.remove(e),d.remove(e.slice(7)))}})},add:function(e,t,n){e&&"function"!=typeof t&&("object"===o(t)&&(t=JSON.stringify(t)),localStorage.setItem(e,t),n&&d.expire(e,n))},remove:function(e,t){localStorage.removeItem(e),t&&localStorage.removeItem("expire-"+e)},get:function(e){var t=localStorage.getItem(e);try{return JSON.parse(t)}catch(e){return t}}},l={generateUuid:function(){var e=Date.now(),t=e+"_"+e.toString(16).slice(3);return("xxxyxxx_xxxx_xxxx_".replace(/[xy]/g,function(e){var t=16*Math.random()|0;return("x"==e?t:3&t|8).toString(16)})+t).toUpperCase()},getUuid:function(){var e=d.get("report_point_uuid");return e||(e=this.generateUuid(),d.add("report_point_uuid",e),e)}},f={getSearch:function(e){var t=0<arguments.length&&void 0!==e?e:"";return this.getQueryParams(t)},getHash:function(e){var t=0<arguments.length&&void 0!==e?e:"",n=t.indexOf("?");if(!(n<0))return this.getQueryParams(t.slice(n))},getRequestParam:function(e,t){var n=0<arguments.length&&void 0!==e?e:"";if(!n)return null;var r=new RegExp("(^|#|&)"+(1<arguments.length&&void 0!==t?t:"")+"=([^&]*)(&|$)"),i=n.substr(1).match(r);return null!=i?unescape(i[2]):null},getQueryParams:function(e){if(!e)return!1;var t=(e=e.substr(1)).split("&");if(t&&t.length){var n={};for(var r in t){var i=t[r].split("=");i&&i[0]&&i[1]&&(n[i[0]]=i[1])}return n}return!1}},p={href:encodeURIComponent(window.location.href),search:window.location.search,referrer:encodeURIComponent(document.referrer||""),hash:window.location.hash,language:navigator.language,width:window.screen.width,height:window.screen.height,os:navigator.platform,getSearch:function(){return f.getSearch(this.search)},getHash:function(){return f.getHash(this.hash)},browser:function(){for(var e=navigator.userAgent,t=["chrome","safari","firefox","opera","ie"],n={chrome:e.match(/Chrome\/([\d.]+)/)||e.match(/CriOS\/([\d.]+)/),safari:e.match(/Safari\/([\d.]+)/),firefox:e.match(/Firefox\/([\d.]+)/),opera:e.match(/OPR\/([\d.]+)/),ie:e.match(/MSIE\s([\d\.]+)/)||e.match(/(?:trident)(?:.*rv:([\w.]+))?/i)},r=0;r<t.length;r++){var i=n[t[r]];if(i)return i[0]}}},v=function(){var e={event_props:{create_time:Date.now(),random:s(),ip:"",pid:"",adid:"",channel_id:"",app_version:"",longitude:"",latitude:"",component_id:"",component_name:""},equitment_custom:{imei:"",androidid:"",uuid:l.getUuid(),idfa:"",idfv:"",appkey:i.appkey,ua:r.ua,openid:i.openid,user_id:i.user_id,platform:r.getPlatform()},event_id:"",event_custom:{current_page:"",referred_page:""},custom:{}};return(r.isH5()||r.isPc())&&(c(e.event_props,i),c(e.event_props,p.getSearch()),Object.assign(e.event_custom,{current_page:p.href,referred_page:p.referrer})),r.isApp()&&(c(e.event_props,i.apps),c(e.equitment_custom,i.apps)),{values:e}},h=function(){var e={device_brand:"",device_version:""};return(r.isH5()||r.isPc())&&(e.os=p.os,e.language=p.language,e.screen_size="".concat(p.width+"*"+p.height),e.chrome_version=p.browser(),e.device_type=r.getDeviceType(),e.device_brand=r.getDeviceBrand()),{event_custom:e}},m={timer:null,errorQueue:[],sendBefore:function(e){var t=v().values;return Object.assign(t.event_props,e.data.event_props),Object.assign(t.event_custom,e.data.event_custom),Object.assign(t.custom,e.data.custom),t.event_id=e.data.event_id,{data:t}},send:function(e){var t=e.async;if(!1===((e=this.sendBefore(e)).async=t))return a(i.api,e);this.createXhr(e)},createXhr:function(n){var r=this;n.success=function(e){try{(e="object"===o(e)?e:JSON.parse(e))._ret&&r.setErrorQueue(n.data)}catch(e){console.error(e)}},n.error=function(e){var t=e.msg;console.error(t),r.setErrorQueue(n.data)},setTimeout(function(){r.reportRata(),a(i.api,n)},0)},setErrorQueue:function(e){try{this.errorQueue.push(JSON.parse(JSON.stringify({data:e})))}catch(e){console.error(e)}},reportRata:function(){var e=this;this.timer||(this.timer=setInterval(function(){e.retryErrorQueue()},i.failureReportRate))},retryErrorQueue:function(){var e=this.errorQueue.length;if(e<i.failureQueueCount)return clearInterval(this.timer),this.timer=null;for(var t=0;t<e&&!(t>i.failureQueueCount);t++){var n=this.errorQueue.shift();this.createXhr(n)}}},g={startX:0,startY:0,startTime:0,event:null,bindEvent:function(e){(this.event=e).bodyDom.removeEventListener("touchstart",this.touchstart,!1),e.bodyDom.removeEventListener("touchend",this.touchend,!1),e.bodyDom.addEventListener("touchstart",this.touchstart,!1),e.bodyDom.addEventListener("touchend",this.touchend,!1),window.removeEventListener("unload",this.handleUnload,!1),window.addEventListener("unload",this.handleUnload,!1)},handleUnload:function(){g.event.callback({},"exit")},isTap:function(e){return e.time<300&&Math.abs(e.distanceX)<10&&Math.abs(e.distanceY)<10},touchstart:function(e){var t=g,n=e.touches[0];t.startX=n.pageX,t.startY=n.pageY,t.startTime=Date.now()},touchend:function(e){var t=g,n=e.target,r=e.changedTouches[0],i={time:Date.now()-t.startTime,distanceX:t.startX-r.pageX,distanceY:t.startY-r.pageY};if(t.isTap(i)){var o=t.event.getParents(n,t.event.elementsName);(o=o&&t.event.getElementData(o.dataset||{}))&&t.event.callback({data:o})}}},y={event:null,bindEvent:function(e){(this.event=e).bodyDom.removeEventListener("click",this.handleClick,!1),e.bodyDom.addEventListener("click",this.handleClick,!1),window.removeEventListener("unload",this.handleUnload,!1),window.addEventListener("unload",this.handleUnload,!1)},handleUnload:function(){y.event.callback({},"exit")},handleClick:function(e){var t=y,n=e.target,r=t.event.getParents(n,t.event.elementsName);(r=r&&t.event.getElementData(r.dataset||{}))&&t.event.callback({data:r})}},b=Object.prototype.toString,_={elementsName:[],bodyDom:null,callback:null,isH5:null,getParents:function(e,t){var n=1<arguments.length&&void 0!==t?t:[],r=!0,i=e;if(1!==e.nodeType)return!1;for(;r&&i&&1===i.nodeType;){for(var o=0,a=n.length;o<a;o++){if("#"+i.id===n[o]){r=!1;break}if(-1<i.className.indexOf(n[o].slice(1))){r=!1;break}}if(!r)return i;i=i.parentElement}return i},getElementData:function(e){var t=0<arguments.length&&void 0!==e?e:{},n=!0,r={custom:{},event_id:t.event_id,event_props:{},event_custom:{}};for(var i in t){var o=t[i];o&&(-1<i.indexOf("Ep")&&(n=!1,r.event_props[i.replace(/Ep/,"")]=o),-1<i.indexOf("Ec")&&(r.event_custom[i.replace(/Ec/,"")]=o),-1<i.indexOf("Cm")&&(r.custom[i.replace(/Cm/,"")]=o))}return!n&&r},composeParameters:function(e){return"string"==typeof e&&this.elementsName.push(e),"[object Array]"===b.call(e)&&(this.elementsName=e),e},bindEvent:function(e,t,n){var r=0<arguments.length&&void 0!==e?e:"",i=1<arguments.length?t:void 0,o=2<arguments.length?n:void 0;if(r){if(this.composeParameters(r),this.bodyDom=document.querySelector("body"),this.callback=o,this.isH5=i)return g.bindEvent(this);y.bindEvent(this)}}},x=r.getAppName(),w={callNative:{cola:function(e,t){try{r.isAndroid?window.hsb_native_cola[e](t):webkit.messageHandlers[e].postMessage(t)}catch(e){console.error(e)}},ziyou:function(){}},call:function(e,t){var n="nativeCallName_".concat(s(15));if("function"!=typeof this.callNative[x])return console.error("call natvie ".concat(x," not funciton"));this.callNative[x](e,n),window[n]=function(){var e=0<arguments.length&&void 0!==arguments[0]?arguments[0]:{};try{e="string"==typeof e?JSON.parse(e):e}catch(e){console.error(e)}return t(e)},"development"===i.env&&setTimeout(function(){window[n]()})}},S={getAppInfo:function(t){w.call("hsb_getAppInfo",function(e){return t(e)})}},P={getAppInfo:function(t){w.call("hsb_getAppInfo",function(e){return t(e)})}},A=r.getAppName(),E={cola:S,ziyou:P},O={getAppInfo:function(t){E[A].getAppInfo(function(e){"development"===i.env&&(e={app_version:"1",longitude:143.22,latitude:144.11,appkey:"sdsd1234lfjk",pid:"111",adid:"231",sys:"ios"}),t(e)})}},T={page:function(e,t,n){var r=0<arguments.length&&void 0!==e?e:"",i=1<arguments.length&&void 0!==t?t:"",o=2<arguments.length&&void 0!==n?n:"";if(!r)return console.error("eventId不能为空");m.send({data:{event_id:r,event_custom:{current_page:i,referred_page:o}}})},page_exit:function(e,t){this.page("page_exit",e,t)},page_entrance:function(e,t){this.page("page_entrance",e,t)},page_exitPlatform:function(){m.send({data:{event_id:"page_exitPlatform"},async:!1})}},k=function(e,t){if(r.isPc()&&_.bindEvent(e,!1,function(e,t){if("exit"===t)return T.page_exitPlatform();m.send(e)}),r.isH5()&&_.bindEvent(e,!0,function(e,t){if("exit"===t)return T.page_exitPlatform();m.send(e)}),r.isApp())return O.getAppInfo(function(e){!function(e){for(var t in e)i.apps[t]=e[t]}(e),t&&t()});t&&t()},I={VueApp:{app:null,router:function(e,r){var t=(this.app=e).$router,i=t.mode,o=t.history;t.beforeEach(function(e,t,n){r(e.fullPath,t.fullPath,i,o.base),n()}),t.onError(function(e){console.error(e)})}},ReactApp:null},N=i;e.onBtn=function(e){var t=0<arguments.length&&void 0!==e?e:{};m.send({data:t})},e.onLaunch=function(e){var t=0<arguments.length&&void 0!==e?e:{},n={data:Object.assign(t,h())};m.send(n)},e.setConfig=function(e){!function(e){for(var t in e)i[t]=e[t]}(e)},e.init=function(e,t){"function"==typeof e&&(t=e,e=".af-data-report"),k(e,t)},e.joinApp=function(e){return function(e){var t=e.interfaceApp,n=e.frameName;if("object"!==o(t))return console.error("interfaceApp有误");if(!I[n])return console.error("frameName: ".concat(n,"有误"));try{var c=function(){var t=[];return function(e){return 2<t.length&&t.pop(),t.unshift(e),t[1]}}();I[n].router(t,function(e,t,n,r){var i=u(e,t,n,r),o=i.cur,a=i.prev,s=u("",c(t),n,r);T.page_exit(a,s.prev),T.page_entrance(o,a)})}catch(e){console.error(e)}}(e)},e.configs=N,Object.defineProperty(e,"__esModule",{value:!0})});
