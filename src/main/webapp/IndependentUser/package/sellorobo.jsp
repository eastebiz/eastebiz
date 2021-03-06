<%@ page import="com.eastebiz.entity.EbizUser" %>
<%@ page import="com.eastebiz.entity.EbizCompany" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/lib/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/lib/bootstrap-table/bootstrap-table.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/main.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/lib/jquery/jquery-3.3.1.js"></script>
    <script type="text/javascript" src="../../static/lib/bootstrap/js/bootstrap.js"></script>
    <script type="text/javascript" src="../../static/lib/bootstrap-table/bootstrap-table.js"></script>

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



        /*  选择地址 */

        /* 家里 */
        function queryHomeAddress() {
            $.post(
                "${pageContext.request.contextPath}/EbizUser/selectAddress",
                function (obj) {
                    $("#Package-shippingAddress").prop("value",obj.address);
                    $("#Package-addressStatus").val("Home");
                },
                "json"
            )
        }

        /*
           三个出库
        * */
        function queryAddress1() {
            $.post(
                "${pageContext.request.contextPath}/EbizCompany/selectAddress1",
                function (obj) {
                    $("#Package-shippingAddress").prop("value",obj);
                    $("#Package-addressStatus").val("WareHouse");
                },
                "json"
            )
        }



        function queryAddress2() {
            $.post(
                "${pageContext.request.contextPath}/EbizCompany/selectAddress2",
                function (obj) {
                    $("#Package-shippingAddress").prop("value",obj);
                    $("#Package-addressStatus").val("WareHouse");
                },
                "json"
            )
        }


        function queryAddress3() {
            $.post(
                "${pageContext.request.contextPath}/EbizCompany/selectAddress3",
                function (obj) {
                    $("#Package-shippingAddress").prop("value",obj);
                    $("#Package-addressStatus").val("WareHouse");
                },
                "json"
            )
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
                            <a class="mobile-link" href="userAccountSetting.jsp">账户设置</a> |
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
            <div class="col-md-10 ">
                <div class="col-md-12 text-center">
                    <h3>求购/议价</h3>
                </div>

                <%-- 按钮  --%>
                <div class="row">
                    <div class="col-md-6"></div>
                    <div class="col-md-6 text-right">

                        <a class="btn btn-default" style="background-color: #aeffc8" href="${pageContext.request.contextPath}/IndependentUser/package/querySellorobo.jsp" role="button">求购/议价产品管理</a>
                    </div>
                </div>


                <div class="row">
                    <div class="col-md-1 "></div>
                    <div class="col-md-10 ">


                        <form id="userloginForm"   action="${pageContext.request.contextPath}/Product/" method="post" >

                            <div class="row">
                                <div class="form-group">
                                  <%--  <input input type="text" class="form-control" id="Product-id" name="id" value="${sessionScope.newProduct.id}" hidden>--%>

                                    <div class="form-group">
                                        <div class="row">
                                            <div class="col-md-12">
                                                可以填写产品
                                            </div>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-md-2"><span>Model:</span></div>
                                        <div class="col-md-4">
                                            <input type="text" class="form-control" id="Package-model" name="model" placeholder="Model"   value="${sessionScope.newProduct.model}" autofocus required>
                                        </div>

                                        <div class="col-md-2"><span>Brand:</span></div>
                                        <div class="col-md-4">
                                            <input type="text" id="Package-brand" class="form-control" name="brand" placeholder="Brand"   value="${sessionScope.newProduct.brand}">
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="row">
                                    Product Name:
                                    <div class="col-md-12">
                                        <input type="text" id="Package-productName" class="form-control" name="productName" placeholder="ProductName"  value="${sessionScope.newProduct.productName}" autofocus required>
                                    </div>
                                </div>
                            </div>

                            <div class="form-group">
                                <div class="row">
                                    <div class="col-md-12">
                                        输入其它信息
                                    </div>
                                </div>
                            </div>

                            <div class="form-group">
                                <div class="row">

                                    <div class="col-md-1"><span>数量:</span></div>
                                    <div class="col-md-2">
                                        <input type="text" id="Package-packageQuantity"   class="form-control" name="packageQuantity" placeholder="0">
                                    </div>
                                    <div class="col-md-1"><span>价格:</span></div>
                                    <div class="col-md-2">
                                        <input type="text" id="Package-"   class="form-control" name="submitPrice" placeholder="0.0">
                                    </div>

                                    <%-- 未确认状态下的包裹状态 --%>
                                    <div class="col-md-2 text-center">
                                        <label class="radio-inline radio">
                                            <input type="radio" id="Package-status1"  name="status" value="UnComfirmUnShipped">:未下单
                                        </label>
                                    </div>

                                    <div class="col-md-2 text-center">
                                        <label class="radio-inline radio">
                                            <input type="radio" id="Package-status2" name="status" value="UnComfirmShipped">:已下单
                                        </label>
                                    </div>


                                    <div class="col-md-2 text-center">
                                        <label class="radio-inline ">
                                            <input type="radio" id="Package-status3" name="status" value="UnComfirmInStock">:现货
                                        </label>
                                    </div>
                                </div>
                            </div>

                            <div class="form-group">
                                <div class="row">
                                    <div class="col-md-1"><span>信用卡信息:</span></div>
                                    <div class="col-md-11">
                                        <input type="text" id="Package-creditCardNumber" class="form-control" name="creditCardNumber" >
                                    </div>
                                </div>
                            </div>


                            <div class="form-group">
                                选择地址：
                                <div class="row">
                                    <div class="col-md-2"><span>护士家:</span></div>
                                    <div class="col-md-2">
                                        <button id="Package-Home" type="button"  onclick="queryHomeAddress()" class="btn btn-default-update">Home</button>
                                    </div>
                                    <div class="col-md-2"><span>仓库:</span></div>
                                    <div class="col-md-2">
                                        <button id="Package-address1" type="button"  onclick="queryAddress1()" class="btn btn-default-update">address1</button>
                                    </div>
                                    <div class="col-md-2">
                                        <button id="Package-address2" type="button"  onclick="queryAddress2()" class="btn btn-default-update">address2</button>
                                    </div>
                                    <div class="col-md-2">
                                        <button id="Package-address3" type="button"  onclick="queryAddress3()" class="btn btn-default-update">address3</button>
                                    </div>
                                </div>
                            </div>

                            <%--  地址状态  --%>
                            <div class="form-group">
                                <div class="row">
                                    <div class="col-md-2">
                                        <input type="text" id="Package-addressStatus" class="form-control" name="addressStatus" hidden>
                                    </div>
                                    <div class="col-md-10"></div>
                                </div>
                            </div>


                            <div class="form-group">
                                <div class="row">
                                    <div class="col-md-2"><span>地址:</span></div>
                                    <div class="col-md-10">
                                        <input type="text" id="Package-shippingAddress" class="form-control" name="shippingAddress"  disabled placeholder="Address">
                                    </div>
                                </div>
                            </div>

                            <div class="form-group">
                                <div class="row">
                                    <div class="col-md-5"></div>
                                    <div class="col-md-2 text-center">
                                        <button type="submit" class="btn btn-default"><h4>submit</h4></button>
                                    </div>
                                    <div class="col-md-5"></div>
                                </div>
                            </div>
                        </form>
                    </div>
                    <div class="col-md-1 "></div>
                </div>

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
                        添加用户操作
                    </div>
                    <div class="col-md-12"><a class="mobile-link" href='${pageContext.request.contextPath}/company/queryAllUser.jsp'>查看所有用户</a></div>
                    <div class="col-md-12"><a class="mobile-link" href='${pageContext.request.contextPath}/company/addUser.jsp'>添加新用户</a></div>
                    <div class="col-md-12"><a class="mobile-link" href='${pageContext.request.contextPath}/company/companyAdding.jsp'>收到新请求</a></div>


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
                        公司产品管理
                    </div>

                    <div class="col-md-12"><a class="mobile-link" href='${pageContext.request.contextPath}/product/queryAllProduct.jsp'>产品管理</a></div>
                    <div class="col-md-12"><a class="mobile-link" href='allDealSendToNurseManage.jsp'>Deal管理</a></div>
                    <div class="col-md-12"><a class="mobile-link" href='${pageContext.request.contextPath}/product/queryAllPackForCompany.jsp'>包裹管理</a></div>
                    <div class="col-md-12"><a class="mobile-link" href='${pageContext.request.contextPath}/product/inventory.jsp'>库存管理</a></div>
                    <div class="col-md-12"><a class="mobile-link" href='${pageContext.request.contextPath}/IndependentUser/package/allUnCheckedPackForCompany.jsp'>对单</a></div>
                    <div class="col-md-12"><a class="mobile-link" href='allUnLabeledPackForCompany.jsp'>发送Lable</a></div>
                    <div class="col-md-12"><a class="mobile-link" href='${pageContext.request.contextPath}/IndependentUser/package/allUnPaidPackForCompany.jsp'>支付用户</a></div>
                    <div class="col-md-12"><a class="mobile-link" href='sendEmail.jsp'>发邮件</a></div>

                    <div class="col-md-12">
                        任务操作
                    </div>

                    <div class="col-md-12"><a class="mobile-link" href='${pageContext.request.contextPath}/IndependentUser/package/queryReportPackage.jsp'>领票/预报</a></div>
                    <div class="col-md-12"><a class="mobile-link" href='${pageContext.request.contextPath}/IndependentUser/package/querySellorobo.jsp'>求收购/议价</a></div>
                    <div class="col-md-12"><a class="mobile-link" href='${pageContext.request.contextPath}/IndependentUser/package/unReceivedPacAndUnConfirmed.jsp'>更新包裹信息</a></div>
                    <div class="col-md-12"><a class="mobile-link" href='${pageContext.request.contextPath}/IndependentUser/package/shippedPackOrUnMatchedPack.jsp'>修改 Tracking Number</a></div>
                    <div class="col-md-12"><a class="mobile-link" href='${pageContext.request.contextPath}/IndependentUser/package/unPaidPac.jsp'>更新信用卡信息</a></div>
                    <div class="col-md-12"><a class="mobile-link" href='${pageContext.request.contextPath}/IndependentUser/package/packingPac.jsp'>打包包裹</a></div>
                    <div class="col-md-12"><a class="mobile-link" href='${pageContext.request.contextPath}/IndependentUser/package/livingDeal.jsp'>正在收购</a></div>

                    <div class="col-md-12">
                        查看包裹
                    </div>

                    <div class="col-md-12"><a class="mobile-link" href='${pageContext.request.contextPath}/IndependentUser/package/allPack.jsp'>所有包裹</a></div>
                    <div class="col-md-12"><a class="mobile-link" href='${pageContext.request.contextPath}/IndependentUser/package/unConfirmedSellOrOBOPack.jsp'>未确认包裹</a></div>
                    <div class="col-md-12"><a class="mobile-link" href='${pageContext.request.contextPath}/IndependentUser/package/unReceivedPac.jsp'>未发货包裹</a></div>
                    <div class="col-md-12"><a class="mobile-link" href='${pageContext.request.contextPath}/IndependentUser/package/shippedPack.jsp'>途中包裹</a></div>
                    <div class="col-md-12"><a class="mobile-link" href='${pageContext.request.contextPath}/IndependentUser/package/instockPack.jsp'>在家包裹</a></div>
                    <div class="col-md-12"><a class="mobile-link" href='${pageContext.request.contextPath}/IndependentUser/package/unPaidPac.jsp'>待结算包裹</a></div>
                    <div class="col-md-12"><a class="mobile-link" href='${pageContext.request.contextPath}/IndependentUser/package/paidPac.jsp'>已结算包裹</a></div>
                    <div class="col-md-12"><a class="mobile-link" href='${pageContext.request.contextPath}/IndependentUser/package/shipCompletePac.jsp'>邮寄完成包裹</a></div>
                    <div class="col-md-12"><a class="mobile-link" href='${pageContext.request.contextPath}/IndependentUser/package/unMatchPac.jsp'>不匹配包裹</a></div>

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
            <%--<div class="col-md-1 "></div>--%>
        </div>
    </div>
</section>

</body>
</html>

