(window.webpackJsonp=window.webpackJsonp||[]).push([[0],{14:function(e,t,n){},32:function(e,t,n){e.exports=n(65)},37:function(e,t,n){},65:function(e,t,n){"use strict";n.r(t);var a=n(0),c=n.n(a),r=n(27),o=n.n(r),s=(n(37),n(6)),i=n(7),l=n(9),u=n(8),m=n(10),p=(n(14),n(13)),h=n(11),b=function(e){function t(){return Object(s.a)(this,t),Object(l.a)(this,Object(u.a)(t).apply(this,arguments))}return Object(m.a)(t,e),Object(i.a)(t,[{key:"render",value:function(){return c.a.createElement("div",{className:"App"},c.a.createElement("header",{className:"App-header"},c.a.createElement("p",null,"tnjrsjtrs")))}}]),t}(a.Component),f=n(28),d=n(29),j=n.n(d),E=function(e){function t(e){var n;return Object(s.a)(this,t),(n=Object(l.a)(this,Object(u.a)(t).call(this,e))).pushRequest=function(){j.a.post("/createAccount",n.state.account).then(function(e){console.log(e)}).then(n.setState({accountNumber:Response.accountNumber})).then(console.log(n.state.accountNumber))},n.setStates=function(e){n.setState({account:Object(f.a)({},e.target.name,e.target.value)})},n.handleSubmit=function(e){e.preventDefault()},n.state={account:{firstname:"gre",lastname:"gs"},accountNumber:"",requestResponse:""},n}return Object(m.a)(t,e),Object(i.a)(t,[{key:"render",value:function(){return c.a.createElement("div",{className:"App"},c.a.createElement("form",{onSubmit:this.handleSubmit,className:"form-inline"},c.a.createElement("label",{className:"required"}),c.a.createElement("label",null,c.a.createElement("input",{type:"text",name:"firstname",target:"one",className:"form-control inputArea",onChange:this.setStates,firstname:this.state.account.firstname,id:"Firstname",placeholder:"firstname *"}),c.a.createElement("input",{type:"text",name:"lastname",target:"two",className:"form-control inputArea",onChange:this.setStates,lastname:this.state.account.lastname,id:"Lastname",placeholder:"lastname *"})),c.a.createElement("input",{type:"submit",value:"Submit",onClick:this.pushRequest})))}}]),t}(a.Component),O=function(e){function t(){return Object(s.a)(this,t),Object(l.a)(this,Object(u.a)(t).apply(this,arguments))}return Object(m.a)(t,e),Object(i.a)(t,[{key:"render",value:function(){return c.a.createElement("div",null,c.a.createElement(p.a,null,c.a.createElement(p.b,{to:"/"},"Home"),c.a.createElement(p.b,{to:"/SignUp"},"SignUp"),c.a.createElement(h.a,{exact:!0,path:"/",component:b}),c.a.createElement(h.a,{path:"/SignUp",component:E})))}}]),t}(a.Component),g=function(e){function t(){return Object(s.a)(this,t),Object(l.a)(this,Object(u.a)(t).apply(this,arguments))}return Object(m.a)(t,e),Object(i.a)(t,[{key:"render",value:function(){return c.a.createElement("div",{className:"App"},c.a.createElement("header",{className:"App-header"},c.a.createElement(O,null)))}}]),t}(a.Component);Boolean("localhost"===window.location.hostname||"[::1]"===window.location.hostname||window.location.hostname.match(/^127(?:\.(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)){3}$/));o.a.render(c.a.createElement(g,null),document.getElementById("root")),"serviceWorker"in navigator&&navigator.serviceWorker.ready.then(function(e){e.unregister()})}},[[32,1,2]]]);
//# sourceMappingURL=main.6764f062.chunk.js.map