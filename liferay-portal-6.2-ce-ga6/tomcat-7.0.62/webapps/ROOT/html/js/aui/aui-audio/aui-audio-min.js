YUI.add("aui-audio",function(e,t){var n=e.Object,r=e.Lang,i=e.UA,s=e.config.doc,t="audio",o=e.getClassName,u=o(t,"node"),a=e.config.base+"aui-audio/assets/player.swf",f="fixedAttributes",l="flashVars",c="mp3",h="oggUrl",p="src",d="swfUrl",v="url",m=/\.([^\.]+)$/,g=e.Component.create({NAME:t,ATTRS:{url:{value:"",validator:r.isString},oggUrl:{value:"",validator:r.isString},type:{value:c,validator:r.isString},swfWidth:{value:"100%",validator:r.isString},swfHeight:{value:"30",validator:r.isString},swfUrl:{value:a,validator:r.isString},fixedAttributes:{value:{},validator:r.isObject},flashVars:{value:{},validator:r.isObject},render:{value:!0,validator:r.isBoolean}},BIND_UI_ATTRS:[v,h,d,f,l],SYNC_UI_ATTRS:[v,h],prototype:{renderUI:function(){var t=this;t._renderAudioTask=e.debounce(t._renderAudio,1,t),t._renderSwfTask=e.debounce(t._renderSwf,1,t),t._renderAudio(!t.get(h))},bindUI:function(){var e=this;e.publish("audioReady",{fireOnce:!0})},load:function(){var e=this;e._audio.hasMethod("load")&&e._audio.invoke("load")},pause:function(){var e=this;e._audio.hasMethod("pause")&&e._audio.invoke("pause")},play:function(){var e=this;e._audio.hasMethod("play")&&e._audio.invoke("play")},_createSource:function(t){var n=new e.Node(s.createElement("source"));return n.attr("type",t),n},_renderSwf:function(){var t=this,s=t.get(d);if(s){var o=t.get(l);t._setMedia(o);var u=e.QueryString.stringify(o);t._swfId?t._audio.removeChild(e.one("#"+t._swfId)):t._swfId=e.guid();var a='type="application/x-shockwave-flash" data="'+s+'"',c="";i.ie&&(a='classid="clsid:d27cdb6e-ae6d-11cf-96b8-444553540000"',c='<param name="movie" value="'+s+'"/>');var h=t.get(f),p=[];for(var v in h)n.owns(h,v)&&p.push('<param name="',v,'" value="',h[v],'" />');var m="";u&&(m='<param name="flashVars" value="'+u+'" />');var y=t.get("swfHeight"),b=t.get("swfWidth"),w=r.sub(g.TPL_FLASH,{applicationType:a,id:t._swfId,fixedAttributes:p.join(""),flashVars:m,height:y,movie:c,width:b});t._audio.append(w)}},_renderAudio:function(t){var n=this,s=g.TPL_AUDIO;i.gecko&&t&&(s=g.TPL_AUDIO_FALLBACK);var o=r.sub(s,[e.guid()]),u=e.Node.create(o);return n.get("contentBox").append(u),n._audio=u,u},_setMedia:function(e){var t=this;if(!n.owns(e,c)&&!n.owns(e,"mp4")&&!n.owns(e,"flv")){var r=t.get(v),i=t.get("type");if(!i){var s=m.exec(r);s&&(i=s[1])}e[i]=r}},_uiSetFixedAttributes:function(){var e=this;e._renderSwfTask()},_uiSetFlashVars:function(){var e=this;e._renderSwfTask()},_uiSetOggUrl:function(e){var t=this;if(i.gecko||i.opera){var n=t._audio,r=t._usingAudio();if(!e&&r||e&&!r)n.remove(!0),n=t._renderAudio(!e);if(!e)t._renderSwfTask();else{var s=t._sourceOgg;s||(s=t._createSource("audio/ogg"),n.append(s),t._sourceOgg=s),s.attr(p,e)}}},_uiSetSwfUrl:function(){var e=this;e._renderSwfTask()},_uiSetUrl:function(e){var t=this,n=t.get(h),r=t._audio,s=t._sourceMp3;if(i.gecko&&!t._usingAudio())s!==null&&(s.remove(!0),t._sourceMp3=null);else if(r||!n)s||(s=t._createSource("audio/mp3"),r.append(s),t._sourceMp3=s),s.attr(p,e);t._renderSwfTask()},_usingAudio:function(){var e=this;return e._audio.get("nodeName").toLowerCase()==="audio"}}});g.TPL_AUDIO='<audio id="{0}" controls class="'+u+'"></audio>',g.TPL_AUDIO_FALLBACK='<div class="'+u+'"></div>',g.TPL_FLASH='<object id="{id}" {applicationType} height="{height}" width="{width}">{movie}{fixedAttributes}{flashVars}</object>',e.Audio=g},"2.0.0",{requires:["aui-node","aui-component","querystring-stringify-simple"],skinnable:!0});
