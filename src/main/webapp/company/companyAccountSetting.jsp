<%@ page import="com.eastebiz.entity.EbizUser" %>
<%@ page import="com.eastebiz.entity.EbizCompany" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/lib/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" href="../static/lib/bootstrap-table/bootstrap-table.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/main.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/lib/jquery/jquery-3.3.1.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/lib/bootstrap/js/bootstrap.js"></script>
    <script type="text/javascript" src="../static/lib/bootstrap-table/bootstrap-table.js"></script>

    <script type="text/javascript">
        window.onload=function(){
            setInterval(function(){
                var date=new Date();
                var year=date.getFullYear(); //获取当前年份
                var mon=date.getMonth()+1; //获取当前月份
                var da=date.getDate(); //获取当前日
                var day=date.getDay(); //获取当前星期几
                var h=date.getHours(); //获取小时
                var m=date.getMinutes(); //获取分钟
                var s=date.getSeconds(); //获取秒
                var d=document.getElementById('datetime');
                d.innerHTML='当前时间:'+year+'年'+mon+'月'+da+'日'+'星期'+day+' '+h+':'+m+':'+s;  },1000)

        }






    </script>

</head>
<body>

<%
    EbizUser ebizUserbizUser = (EbizUser) session.getAttribute("EbizUser");
    EbizCompany ebizCompany = (EbizCompany) session.getAttribute("EbizCompany");
    if (ebizUserbizUser != null || ebizCompany!= null) {


    }else{
        response.sendRedirect(request.getContextPath()+"/homepage/homepage.jsp");
        return;
    }

%>

<!-- 顶部 -->
<header id="header-main">
    <div class="main-topbar">
        <div class="container">
            <div class="row">
                <div class="col-md-2 "><a class="mobile-link" href="${pageContext.request.contextPath}/DropOut/dropOut"><h1 class="eastebiz">EastEbiz</h1></a></div>
                <div class="col-md-4"></div>
                <div class="col-md-6 text-right">
                    <span>
                        <div style="float: right; padding-top: 10px;">
                        <div style="font-size: 12px;">
                             <a class="mobile-link" href="userAccountSetting.jsp" style=""> 欢迎您！
                                ${sessionScope.EbizCompany.owerName},${sessionScope.EbizCompany.companyName}
                             </a>,
                            <a class="mobile-link" href="${pageContext.request.contextPath}/DropOut/dropOut" style="">退出</a> |
                            <a class="mobile-link" href="${pageContext.request.contextPath}/company/compayModify.jsp">账户设置</a> |
                            <a class="mobile-link" href="dnusermanual.jsp">用户手册</a>
            </div>

            <div id="datetime" style="font-size: 12px; color: black; padding-top: 3px;">
                <!-- 方式一<script>
                     setInterval("document.getElementById('datetime').innerHTML=new Date().toLocaleString();", 1000);
                 </script>-->
            </div>
                            <!-- 原始<div style="font-size: 14px; color: #666666; padding-top: 3px;">
                                        Pay Every Two Weeks: Next Payment Date: (M-D-Y) 03-15-2019

                            </div>-->
        </div>

                    </span>
                </div>
            </div>
        </div>
    </div>
</header>

<%--  --%>
<section id="section-space2">
</section>





<section id="menu-section">
    <div class="menu-div">
        <div class="row">
            <div class="col-md-10">
                <div class="col-md-12 text-center">
                    <h3>公司资料(Company Profile)</h3>
                </div>
                <div class="row">
                    <%-- 左边部分 --%>
                    <div class="col-md-6"></div>

                        <%-- 右边部分  --%>
                    <div class="col-md-6">
                        <div class="col-md-12">
                            <strong><font color="#0f36ff"> <span>设置公司地址：(Company Address)</span></font></strong>
                        </div>
                        <div class="col-md-12 text-center">
                            <strong><font color="#ffe42e"> <span>系统会保留三个公司地址名称方便子账号下单报单用(长读小于100)</span></font></strong>
                        </div>
                        <section >
                            <form id="companyForm"   action="${pageContext.request.contextPath}/EbizCompany/amendAddressAndEmailAndphoneNumber" method="post" >

                                <%--  id --%>

                                <div class="form-group">
                                    <div class="row">
                                        <div class="col-md-4"></div>
                                        <div class="col-md-1"></div>
                                        <div class="col-md-4">
                                            <input type="text" class="form-control"   name="id" hidden readonly placeholder="id"value="${sessionScope.EbizCompany.id}">

                                        </div>
                                        <div class="col-md-3"></div>
                                    </div>
                                </div>


                                <div class="form-group">
                                    <div class="row">
                                        地址1:
                                        <div class="col-md-3">
                                            <input type="text" class="form-control" name="address1Name" value="${sessionScope.EbizCompany.address1Name}">
                                        </div>

                                        地址2:
                                        <div class="col-md-3">
                                            <input type="text" class="form-control" name="address2Name" value="${sessionScope.EbizCompany.address2Name}" >
                                         </div>
                                        地址3:
                                        <div class="col-md-3">
                                            <input type="text" class="form-control"  name="address3Name" value="${sessionScope.EbizCompany.address3Name}">
                                        </div>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <div class="row">
                                        <div class="col-md-4">
                                            <textarea id="address1Value" class="form-control" rows="3" name="address1Value" >${sessionScope.EbizCompany.address1Value}</textarea>
                                        </div>

                                        <div class="col-md-4">
                                            <textarea id="address2Value" class="form-control" rows="3" name="address2Value">${sessionScope.EbizCompany.address2Value}</textarea>
                                        </div>
                                        <div class="col-md-4">
                                            <textarea  id="address3Value" class="form-control" rows="3" name="address3Value">${sessionScope.EbizCompany.address3Value}</textarea>
                                        </div>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <div class="row">
                                        Email:
                                        <div class="col-md-5">
                                            <input type="text" class="form-control"  name="email" value="${sessionScope.EbizCompany.email}">
                                        </div>

                                        <%--<div class="col-md-5">
                                            <input type="text" class="form-control"  name="" value="">
                                        </div>--%>
                                    </div>
                                </div>


                                <div class="form-group">
                                    <div class="row">
                                        Phone:
                                        <div class="col-md-5">
                                            <input type="text" class="form-control"  name="phoneNumber" value="${sessionScope.EbizCompany.phoneNumber}">
                                        </div>
                                        <div class="col-md-5"></div>
                                    </div>
                                </div>


                                <div class="form-group">
                                    <div class="row">
                                        <div class="col-md-12 text-center">
                                            <button type="submit" class="btn btn-default"><strong>Update Address, Email And Phone Number</strong></button>
                                        </div>
                                    </div>
                                </div>
                            </form>
                        </section>


                    </div>

                </div>

                <section>
                    <div class="row">
                        <div class="col-md-12 text-center">
                            <strong><font> <span>用户手册:</span></font></strong>
                        </div>
                        <div class="col-md-12 text-center">
                            <strong><font color="#ffe42e"> <span>设置的用户手册内容会作为贵公司所有人的用户手册内容，长读不要超过5000字</span></font></strong>
                        </div>
                    </div>

                    <form id="ManualForm"   action="${pageContext.request.contextPath}/EbizCompany/amendUserManual" method="post" >

                        <%--  id --%>

                        <div class="form-group">
                            <div class="row">
                                <div class="col-md-4"></div>
                                <div class="col-md-1"></div>
                                <div class="col-md-4">
                                    <input type="text" class="form-control"   name="id" hidden readonly placeholder="id"value="${sessionScope.EbizCompany.id}">

                                </div>
                                <div class="col-md-3"></div>
                            </div>
                        </div>



                        <div class="form-group">
                            <div class="row">
                                <div class="col-md-1"></div>
                                <div class="col-md-10">
                                    <textarea  class="form-control" rows="12" name="userManual" >${sessionScope.EbizCompany.userManual}</textarea>
                                </div>
                                <div class="col-md-1"></div>
                            </div>
                        </div>


                        <div class="form-group">
                            <div class="row">
                                <div class="col-md-12 text-center">
                                    <button type="submit" class="btn btn-default"><strong>Update User Manual</strong></button>
                                </div>
                            </div>
                        </div>
                    </form>

                </section>

            </div>


            <%-- 菜单栏 --%>
            <div class="col-md-2 text-left"  style="background-color: #aeffc8">
                <!--右侧栏-->
                <div id="wrapperSideBar">

                    <div class="col-md-12">
                        系统Deal订阅管理
                    </div>

                    <div class="col-md-12"><a class="mobile-link" href='livingDeal.jsp'>热门产品</a></div>
                    <div class="col-md-12"><a class="mobile-link" href='livingDeal.jsp'>系统推荐产品</a></div>
                    <div class="col-md-12"><a class="mobile-link" href='livingDeal.jsp'>所有产品</a></div>
                    <div class="col-md-12"><a class="mobile-link" href='livingDeal.jsp'>我的订阅产品</a></div>

                    <div class="col-md-12">
                        公司信息管理
                    </div>

                    <div class="col-md-12"><a class="mobile-link" href='${pageContext.request.contextPath}/company/companyAccountSetting.jsp'>公司账户管理</a></div>
                    <div class="col-md-12"><a class="mobile-link" href='/Member/FinanceList.aspx'>公司财务</a></div>
                    <div class="col-md-12"><a class="mobile-link" href='/Member/FinanceList.aspx'>公司账户充值</a></div>
                    <div class="col-md-12"><a class="mobile-link" href='nurseUserManage.jsp'>用户管理</a></div>
                    <div class="col-md-12"><a class="mobile-link" href='deleteUser.jsp'>删除用户</a></div>
                    <div class="col-md-12"><a class="mobile-link" href='/Member/FinanceList.aspx'>用户分析</a></div>

                    <div class="col-md-12">
                        添加用户操作
                    </div>
                    <div class="col-md-12"><a class="mobile-link" href='${pageContext.request.contextPath}/company/queryAllUser.jsp'>查看所有用户</a></div>
                    <div class="col-md-12"><a class="mobile-link" href='${pageContext.request.contextPath}/company/addUser.jsp'>添加新用户</a></div>
                    <div class="col-md-12"><a class="mobile-link" href='${pageContext.request.contextPath}/company/companyAdding.jsp'>收到新请求</a></div>



                    <div class="col-md-12">
                        公司产品管理
                    </div>

                    <div class="col-md-12"><a class="mobile-link" href='${pageContext.request.contextPath}/product/queryAllProduct.jsp'>产品管理</a></div>
                    <div class="col-md-12"><a class="mobile-link" href='allDealSendToNurseManage.jsp'>Deal管理</a></div>
                    <div class="col-md-12"><a class="mobile-link" href='${pageContext.request.contextPath}/product/queryAllPackForCompany.jsp'>包裹管理</a></div>
                    <div class="col-md-12"><a class="mobile-link" href='${pageContext.request.contextPath}/product/inventory.jsp'>库存管理</a></div>
                    <div class="col-md-12"><a class="mobile-link" href='${pageContext.request.contextPath}/package/allUnCheckedPackForCompany.jsp'>对单</a></div>
                    <div class="col-md-12"><a class="mobile-link" href='allUnLabeledPackForCompany.jsp'>发送Lable</a></div>
                    <div class="col-md-12"><a class="mobile-link" href='${pageContext.request.contextPath}/package/allUnPaidPackForCompany.jsp'>支付用户</a></div>
                    <div class="col-md-12"><a class="mobile-link" href='sendEmail.jsp'>发邮件</a></div>

                    <div class="col-md-12">
                        任务操作
                    </div>

                    <div class="col-md-12"><a class="mobile-link" href='${pageContext.request.contextPath}/package/queryReportPackage.jsp'>领票/预报</a></div>
                    <div class="col-md-12"><a class="mobile-link" href='${pageContext.request.contextPath}/package/querySellorobo.jsp'>求收购/议价</a></div>
                    <div class="col-md-12"><a class="mobile-link" href='${pageContext.request.contextPath}/package/unReceivedPacAndUnConfirmed.jsp'>更新包裹信息</a></div>
                    <div class="col-md-12"><a class="mobile-link" href='${pageContext.request.contextPath}/package/shippedPackOrUnMatchedPack.jsp'>修改 Tracking Number</a></div>
                    <div class="col-md-12"><a class="mobile-link" href='${pageContext.request.contextPath}/package/unPaidPac.jsp'>更新信用卡信息</a></div>
                    <div class="col-md-12"><a class="mobile-link" href='${pageContext.request.contextPath}/package/packingPac.jsp'>打包包裹</a></div>
                    <div class="col-md-12"><a class="mobile-link" href='${pageContext.request.contextPath}/package/livingDeal.jsp'>正在收购</a></div>

                    <div class="col-md-12">
                        查看包裹
                    </div>

                    <div class="col-md-12"><a class="mobile-link" href='${pageContext.request.contextPath}/package/allPack.jsp'>所有包裹</a></div>
                    <div class="col-md-12"><a class="mobile-link" href='${pageContext.request.contextPath}/package/unConfirmedSellOrOBOPack.jsp'>未确认包裹</a></div>
                    <div class="col-md-12"><a class="mobile-link" href='${pageContext.request.contextPath}/package/unReceivedPac.jsp'>未发货包裹</a></div>
                    <div class="col-md-12"><a class="mobile-link" href='${pageContext.request.contextPath}/package/shippedPack.jsp'>途中包裹</a></div>
                    <div class="col-md-12"><a class="mobile-link" href='${pageContext.request.contextPath}/package/instockPack.jsp'>在家包裹</a></div>
                    <div class="col-md-12"><a class="mobile-link" href='${pageContext.request.contextPath}/package/unPaidPac.jsp'>待结算包裹</a></div>
                    <div class="col-md-12"><a class="mobile-link" href='${pageContext.request.contextPath}/package/paidPac.jsp'>已结算包裹</a></div>
                    <div class="col-md-12"><a class="mobile-link" href='${pageContext.request.contextPath}/package/shipCompletePac.jsp'>邮寄完成包裹</a></div>
                    <div class="col-md-12"><a class="mobile-link" href='${pageContext.request.contextPath}/package/unMatchPac.jsp'>不匹配包裹</a></div>

                    <div class="col-md-12">
                        仓库管理
                    </div>

                    <div class="col-md-12"><a class="mobile-link" href='receivePackageWeb.jsp'>接受包裹</a></div>
                    <div class="col-md-12"><a class="mobile-link" href='livingDeal.jsp'>打包</a></div>
                    <div class="col-md-12"><a class="mobile-link" href='livingDeal.jsp'>库存管理</a></div>
                    <div class="col-md-12"><a class="mobile-link" href='livingDeal.jsp'>仓库订单管理</a></div>
                    <div class="col-md-12"><a class="mobile-link" href='livingDeal.jsp'>仓库包裹管理</a></div>

                </div>

            </div>

        </div>
    </div>
</section>

</body>
</html>
