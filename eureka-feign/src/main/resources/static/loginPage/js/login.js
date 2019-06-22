

var logEl = new Vue({
    el:"#login_space",
    data:{
        regUsername:"",
        regUserNameErr:false,
        regPassword:"",
        regPasswordErr:false,
        regRepeatPwd:"",
        regRepeatPwdErr:false,
        checkRule:/^[A-Za-z][A-Za-z0-9]{5,14}$/,
        pwdRule:/[a-zA-Z0-9]{6,15}/,
        errorMsg:""
    },
    methods:{
        register:function(){
            if(!(this.regUserNameErr&&this.regPasswordErr&&this.regRepeatPwdErr)){
                axios.post('/reg', {
                    username: this.regUsername,        // 参数 firstName
                    password: this.regPassword    // 参数 lastName
                })
                    .then(function (response) {
                        console.log(response);
                    })
                    .catch(function (error) {
                        console.log(error);
                    });
            }

        },
        checkUserName:function(){
            if(!this.checkRule.test(this.regUsername)){
                this.regUserNameErr = true;
                this.errorMsg = "用户名格式错误";
                return;
            }
            this.errorMsg = "";
            this.regUserNameErr = false;

        },
        checkPassword:function(){
            if(!this.pwdRule.test(this.regPassword)){
                this.regPasswordErr = true;
                this.errorMsg = "密码格式错误";
                return;
            }
            this.errorMsg = "";
            this.regPasswordErr = false;
        },
        checkRepeatPwd:function(){
            if(this.regRepeatPwd != this.regPassword){
                this.regRepeatPwdErr = true;
                this.errorMsg = "密码不一致";
                return;
            }
            this.errorMsg = "";
            this.regRepeatPwdErr = false;

        }
    }

})