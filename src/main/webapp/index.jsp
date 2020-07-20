<%--
  Created by IntelliJ IDEA.
  User: 程鑫博
  Date: 2020/7/10
  Time: 10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!DOCTYPE html
PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="UTF-8">
    <title>登录</title>
    <script type="text/javascript">
        function  changeVcode() {
            //加random防止页面不刷新
            document.getElementById("code").src="Vcode?m="+Math.random();
        }
    </script>
    <link rel="icon" href="static/img/favicon.ico">
    <link href="static/css/default.css" rel="stylesheet" type="text/css" />
    <!--必要样式-->
    <link href="static/css/styles.css" rel="stylesheet" type="text/css" />
    <link href="static/css/demo.css" rel="stylesheet" type="text/css" />
    <link href="static/css/loaders.css" rel="stylesheet" type="text/css" />
    <style>
        .user-login {
            color: rgb(97, 191, 255);
            margin-right: 40px;
        }

        .login_title {
            display: flex;
            flex: 1;
            padding-left: 20px;
        }
        .verify {
            position: absolute;
            margin-left: -90px;
            width: 90px;
            height: 40px;
        }
        .role0 {
            margin-right: 20px;
        }
        .btn {
            color: #d5d8e2;
            font-size: 12px;
        }
        .font {
            color: red;
        }
    </style>
</head>
<body>
<form action="login" method="post" id="login">
    <div class='login'>
        <div class='login_title'>
            <input type="checkbox" checked="checked" name="role" value="0" style="display:none" class="role0"> <div class="user-login">普通用户登录</div>
            <input type="checkbox" name="role" value="1" style="display:none" class="role1"> <div class="admin-login">管理员登录</div>
        </div>
        <div class='login_fields'>
            <div class='login_fields__user'>
                <div class='icon'>
                    <img alt="" src='static/img/user_icon_copy.png'>
                </div>
                <input name="account" placeholder='请输入用户名' maxlength="16" type='text' autocomplete="off"/>
                <div class='validation'>
                    <img alt="" src='static/img/tick.png'>
                </div>
            </div>
            <div class='login_fields__password'>
                <div class='icon'>
                    <img alt="" src='static/img/lock_icon_copy.png'>
                </div>
                <input name="password" placeholder='请输入密码' maxlength="16" type='password' autocomplete="off"/>
                <div class='validation'>
                    <img alt="" src='static/img/tick.png'>
                </div>
            </div>
            <div class='login_fields__password'>
                <div class='icon'>
                    <img alt="" src='static/img/key.png'>
                </div>
                <input name="inputCode" placeholder='请输入验证码' maxlength="4" type='text' autocomplete="off"/>
                <img class="verify" src="Vcode" id="code" onclick="changeVcode()">
            </div>
            <div class='login_fields__submit'>
                <input type='button' value='登录'>
                <a href="register.jsp;" class="btn">我没有账号，立即注册</a>
                <span class="font">${sessionScope.get("LoginException")}</span>
            </div>
        </div>
        <div class='success'>
        </div>
        <div class='disclaimer'>
            <p>欢迎登陆后台管理系统</p>
        </div>
    </div>
<%--    账号：<input type="text" name="account">--%>
<%--    <br>--%>
<%--    密码：<input type="text" name="password">--%>
<%--    <br>--%>
<%--    <input type="submit" value="登陆">--%>
<%--    <input type="reset" value="重置">--%>
<%--    <input type="checkbox" name="role" value="0"> 用户--%>
<%--    <input type="checkbox" name="role" value="1"> 管理员--%>
<%--    <br>--%>
<%--    输入验证码：<input type="text" name="inputCode">--%>
<%--    <img src="Vcode" id="code" onclick="changeVcode()">--%>
<%--    <br>--%>
<%--    <span>${sessionScope.get("accountinfo")}</span>--%>
</form>
<%--<form action="register" method="get">--%>
<%--    账号：<input type="text" name="account">--%>
<%--    <br>--%>
<%--    密码：<input type="text" name="password">--%>
<%--    <br>--%>
<%--    <input type="submit" value="注册">--%>
<%--    <input type="reset" value="重置">--%>
<%--    <br>--%>
<%--    <span>${requestScope.get("msgreg")}</span>--%>
<%--</form>--%>
<link href="static/layui/css/layui.css" rel="stylesheet" type="text/css" />
<script src="static/js/jquery-1.12.4.js" type="text/javascript"></script>
<script type="text/javascript" src="static/js/jquery-ui.min.js"></script>
<script type="text/javascript" src='static/js/stopExecutionOnTimeout.js?t=1'></script>
<script src="static/layui/layui.js" type="text/javascript"></script>
<script src="static/js/Particleground.js" type="text/javascript"></script>
<script src="static/js/Treatment.js" type="text/javascript"></script>
<script src="static/js/jquery.mockjax.js" type="text/javascript"></script>
<script type="text/javascript">
    $('.admin-login').click(function () {
        $('.admin-login').css('color', 'rgb(97, 191, 255)')
        $('.role1').prop('checked', true);
        $('.role0').prop('checked',false)
        $('.user-login').css('color', '#d5d8e2')
    })
    $('.user-login').click(function () {
        $('.user-login').css('color', 'rgb(97, 191, 255)')
        $('.admin-login').css('color', '#d5d8e2')
        $('.role0').prop('checked', true);
        $('.role1').prop('checked',false)
    })
    //粒子背景特效
    $('body').particleground({
        dotColor: '#E8DFE8',
        lineColor: '#133b88'
    });
        layui.use('layer', function () {
            $('input[type="button"]').click(function () {
                var account = $('input[name="account"]').val();
                var password = $('input[name="password"]').val();
                var inputCode = $('input[name="inputCode"]').val();
                var role = $('input[name="role"]:checked').val();
                if (account == '') {
                    ErroAlert('请输入您的用户名');
                } else if (password == '') {
                    ErroAlert('请输入密码');
                } else if (inputCode == '' || inputCode.length !== 4) {
                    ErroAlert('请输入验证码');
                } else {
                    // $('#login').on('submit', function (e) {
                    //     e.preventDefault();
                    //     var formData = $(this).serialize();
                        $.ajax({
                            url: 'login',
                            type: 'post',
                            data: $('#login').serialize(),
                            dataType: 'json',
                            success: function (data) {
                                if (data.code == 100) {
                                    if (role == 0) {
                                        window.location.href = 'static/user/index.html'
                                    } else {
                                        window.location.href = 'static/admin/index.html'
                                    }
                                } else {
                                    ErroAlert(data.map.err_msg)
                                }
                            }
                        })
                // })
            }
        })
    })
</script>
</body>
</html>
