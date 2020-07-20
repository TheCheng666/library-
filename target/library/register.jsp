<%--
  Created by IntelliJ IDEA.
  User: 程鑫博
  Date: 2020/7/13
  Time: 9:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html
PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
    <meta charset="UTF-8">
    <title>注册</title>
    <link rel="icon" href="static/img/favicon.ico">
    <link href="static/css/default.css" rel="stylesheet" type="text/css" />
    <!--必要样式-->
    <link href="static/css/styles.css" rel="stylesheet" type="text/css" />
    <link href="static/css/demo.css" rel="stylesheet" type="text/css" />
    <link href="static/css/loaders.css" rel="stylesheet" type="text/css" />
    <style>
        .btn {
            color: #d5d8e2;
            font-size: 12px;
        }
    </style>
</head>
<body>
<form action="register" method="get" id="register">
    <div class='login'>
        <div class='login_title'>
            <span>普通用户注册</span>
        </div>
        <div class='login_fields'>
            <div class='login_fields__user'>
                <div class='icon'>
                    <img alt="" src='static/img/user_icon_copy.png'>
                </div>
                <input name="account" placeholder='请输入用户名' maxlength="16" type='text' autocomplete="off" />
                <div class='validation'>
                    <img alt="" src='static/img/tick.png'>
                </div>
            </div>
            <div class='login_fields__password'>
                <div class='icon'>
                    <img alt="" src='static/img/lock_icon_copy.png'>
                </div>
                <input name="password" placeholder='请输入密码' maxlength="16" type='password' autocomplete="off" />
                <div class='validation'>
                    <img alt="" src='static/img/tick.png'>
                </div>
            </div>
            <div class='login_fields__submit'>
                <input type='button' value='注册'>
                <a href="index.jsp" class="btn">已注册，前往登录</a>
            </div>
        </div>
        <div class='success'>
        </div>
        <div class='disclaimer'>
            <p>欢迎注册后台管理系统</p>
        </div>
    </div>
</form>
<link href="static/layui/css/layui.css" rel="stylesheet" type="text/css" />
<script src="static/js/jquery-1.12.4.js" type="text/javascript"></script>
<script type="text/javascript" src="static/js/jquery-ui.min.js"></script>
<script type="text/javascript" src='static/js/stopExecutionOnTimeout.js?t=1'></script>
<script src="static/layui/layui.js" type="text/javascript"></script>
<script src="static/js/Particleground.js" type="text/javascript"></script>
<script src="static/js/Treatment.js" type="text/javascript"></script>
<script src="static/js/jquery.mockjax.js" type="text/javascript"></script>
<script type="text/javascript">
    //粒子背景特效
    $('body').particleground({
        dotColor: '#E8DFE8',
        lineColor: '#133b88'
    });
    layui.use('layer', function () {
        $('input[name="account"]').change(function () {
            $.ajax({
                url: 'checkregister',
                type: 'get',
                data: $('#register').serialize(),
                dataType: 'json',
                success: function (data) {
                    if (data.code == 100) {
                        alert(data.map.re_msg);
                        $('input[type="button"]').click(function () {
                            var account = $('input[name="account"]').val();
                            var password = $('input[name="password"]').val();
                            var inputCode = $('input[name="inputCode"]').val();
                            if (account == '') {
                                ErroAlert('请输入您的用户名');
                            } else if (password == '') {
                                ErroAlert('请输入密码');
                            } else {
                                if (data.code == 100) {
                                    $.ajax({
                                        url: 'register',
                                        type: 'get',
                                        data: $('#register').serialize(),
                                        dataType: 'json',
                                        success: function (data) {
                                            if (data.code == 100) {
                                                alert("注册成功")
                                                window.location.href = 'index.jsp'
                                            } else {
                                                ErroAlert(data.map.err.password)
                                            }
                                        }
                                    })
                                } else {
                                    ErroAlert("账号或者密码错误")
                                }
                            }
                        })
                    } else {
                        alert(data.map.re_msg)
                    }
                }
            })
        })
    })
</script>
</body>
</html>
