(window.webpackJsonp=window.webpackJsonp||[]).push([[0],{14:function(e,t,a){},31:function(e,t,a){e.exports=a(64)},36:function(e,t,a){},64:function(e,t,a){"use strict";a.r(t);var n=a(0),r=a.n(n),c=a(27),s=a.n(c),o=(a(36),a(6)),l=a(7),i=a(9),u=a(8),m=a(10),p=(a(14),a(13)),h=a(11),f=function(e){function t(){return Object(o.a)(this,t),Object(i.a)(this,Object(u.a)(t).apply(this,arguments))}return Object(m.a)(t,e),Object(l.a)(t,[{key:"render",value:function(){return r.a.createElement("div",{className:"App"},r.a.createElement("header",{className:"App-header"},r.a.createElement("p",null,"tnjrsjtrs")))}}]),t}(n.Component),b=a(28),d=a.n(b),E=function(e){function t(e){var a;return Object(o.a)(this,t),(a=Object(i.a)(this,Object(u.a)(t).call(this,e))).pushRequest=function(){d.a.post("/createAccount",a.state.account).then(function(e){a.setState({requestResponse:e.data})}).then(console.log(a.state.requestResponse))},a.setStates=function(e){var t={firstname:a.state.account.firstname,lastname:a.state.account.lastname};"Firstname"===e.target.id&&(t.firstname=e.target.value),"Lastname"===e.target.id&&(t.lastname=e.target.value),a.setState({account:t})},a.handleSubmit=function(e){e.preventDefault()},a.state={firstname:"",lastname:"",account:{firstname:"",lastname:""},accountNumber:"",requestResponse:""},a}return Object(m.a)(t,e),Object(l.a)(t,[{key:"render",value:function(){return r.a.createElement("div",{className:"App"},r.a.createElement("p",null,this.state.account.firstname),r.a.createElement("p",null,this.state.account.lastname),r.a.createElement("form",{onSubmit:this.handleSubmit,className:"form-inline"},r.a.createElement("label",{className:"required"}),r.a.createElement("label",null,r.a.createElement("input",{type:"text",name:"firstname",target:"one",className:"form-control inputArea",onChange:this.setStates,id:"Firstname",placeholder:"firstname *"}),r.a.createElement("input",{type:"text",name:"lastname",target:"two",className:"form-control inputArea",onChange:this.setStates,id:"Lastname",placeholder:"lastname *"})),r.a.createElement("input",{type:"submit",value:"Submit",onClick:this.pushRequest})))}}]),t}(n.Component),j=function(e){function t(){return Object(o.a)(this,t),Object(i.a)(this,Object(u.a)(t).apply(this,arguments))}return Object(m.a)(t,e),Object(l.a)(t,[{key:"render",value:function(){return r.a.createElement("div",null,r.a.createElement(p.a,null,r.a.createElement(p.b,{to:"/"},"Home"),r.a.createElement(p.b,{to:"/SignUp"},"SignUp"),r.a.createElement(h.a,{exact:!0,path:"/",component:f}),r.a.createElement(h.a,{path:"/SignUp",component:E})))}}]),t}(n.Component),O=function(e){function t(){return Object(o.a)(this,t),Object(i.a)(this,Object(u.a)(t).apply(this,arguments))}return Object(m.a)(t,e),Object(l.a)(t,[{key:"render",value:function(){return r.a.createElement("div",{className:"App"},r.a.createElement("header",{className:"App-header"},r.a.createElement(j,null)))}}]),t}(n.Component);Boolean("localhost"===window.location.hostname||"[::1]"===window.location.hostname||window.location.hostname.match(/^127(?:\.(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)){3}$/));s.a.render(r.a.createElement(O,null),document.getElementById("root")),"serviceWorker"in navigator&&navigator.serviceWorker.ready.then(function(e){e.unregister()})}},[[31,1,2]]]);
//# sourceMappingURL=main.49b83ec4.chunk.js.map