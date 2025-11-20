<%--
  Created by IntelliJ IDEA.
  User: Tiep
  Date: 20/08/2025
  Time: 3:46 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/taglib.jsp" %>
<html>
<head>
    <title>Thêm Tòa Nhà</title>
</head>
<body>
    <div class="main-content">
        <div class="main-content-inner">
            <div class="breadcrumbs" id="breadcrumbs">
                <script type="text/javascript">
                    try{ace.settings.check('breadcrumbs' , 'fixed')}catch(e){}
                </script>

                <ul class="breadcrumb">
                    <li>
                        <i class="ace-icon fa fa-home home-icon"></i>
                        <a href="#">Trang quản trị</a>
                    </li>
                    <li class="active">Quản lý tòa nhà</li>
                </ul><!-- /.breadcrumb -->
            </div>

            <div class="page-content">
                <div class="page-header">
                    <h1>
                        Thêm, Sửa tòa nhà
                    </h1>
                </div><!-- /.page-header -->

                <div class = "row" style="font-family: 'Times New Roman', Times, serif;">
                    <div class="col-xs-12">
                        <form class="form-horizontal" role="form" id="form-edit">
                            <div class="form-group">
                                <label class="col-xs-3">Tên tòa nhà</label>
                                <div class="col-xs-9">
                                    <input class="form-control" type="text" id="name" name="name">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-xs-3">Quận</label>
                                <div class="col-xs-3">
                                    <select id="distritid" class="form-control" name="districtId">
                                        <option value="">---Chọn Quận---</option>
                                        <option value="1">Quận 1</option>
                                        <option value="2">Quận 2</option>
                                        <option value="3">Quận 3</option>
                                        <option value="4">Quận 4</option>
                                    </select>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-xs-3">Phường</label>
                                <div class="col-xs-9">
                                    <input class="form-control" type="text" id="ward" name="ward">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-xs-3">Đường</label>
                                <div class="col-xs-9">
                                    <input class="form-control" type="text" id="street" name="street">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-xs-3">Kết cấu</label>
                                <div class="col-xs-9">
                                    <input class="form-control" type="text" id="structure" name="structure">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-xs-3">Số tầng hầm</label>
                                <div class="col-xs-9">
                                    <input class="form-control" type="number" id="numberOfBasement" name="numberOfBasement">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-xs-3">Diện tích sàn</label>
                                <div class="col-xs-9">
                                    <input class="form-control" type="number" id="floorArea" name="floorArea">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-xs-3">Hướng</label>
                                <div class="col-xs-9">
                                    <input class="form-control" type="text" id="direcion" name="direction">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-xs-3">Hạng</label>
                                <div class="col-xs-9">
                                    <input class="form-control" type="text" id="level" name="level">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-xs-3">Diện tích thuê</label>
                                <div class="col-xs-9">
                                    <input class="form-control" type="number" id="rentArea" name="rentArea">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-xs-3">Giá thuê</label>
                                <div class="col-xs-9">
                                    <input class="form-control" type="number" id="rentPrice" name="rentPrice">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-xs-3">Mô tả giá</label>
                                <div class="col-xs-9">
                                    <input class="form-control" type="text" id="rentPriceDescription" name="rentPriceDescription">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-xs-3">Phí dịch vụ</label>
                                <div class="col-xs-9">
                                    <input class="form-control" type="number" id="serviceFee" name="serviceFee">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-xs-3">Phí ô tô</label>
                                <div class="col-xs-9">
                                    <input class="form-control" type="number" id="carFee" name="carFee">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-xs-3">Phí mô tô</label>
                                <div class="col-xs-9">
                                    <input class="form-control" type="number" id="motorbikeFee" name="motorbikeFee">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-xs-3">Phí ngoài giờ</label>
                                <div class="col-xs-9">
                                    <input class="form-control" type="number" id="overtimeFee" name="overtimeFee">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-xs-3">Tiền điện</label>
                                <div class="col-xs-9">
                                    <input class="form-control" type="number" id="electricityFee" name="nelectricityFee">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-xs-3">Đặt cọc</label>
                                <div class="col-xs-9">
                                    <input class="form-control" type="number" id="deposit" name="deposit">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-xs-3">Thanh toán</label>
                                <div class="col-xs-9">
                                    <input class="form-control" type="number" id="payMent" name="payMent">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-xs-3">Thời hạn thuê</label>
                                <div class="col-xs-9">
                                    <input class="form-control" type="datetime" id="rentTime" name="rentTime">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-xs-3">Thời gian trang trí</label>
                                <div class="col-xs-9">
                                    <input class="form-control" type="datetime" id="decorationTime" name="decorationTime">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-xs-3">Tên quản lý</label>
                                <div class="col-xs-9">
                                    <input class="form-control" type="text" id="managerName" name="managerName">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-xs-3">SĐT quản Lý</label>
                                <div class="col-xs-9">
                                    <input class="form-control" type="number" id="managerPhoneNumber" name="managerPhoneNumber">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-xs-3">Phí mô giới</label>
                                <div class="col-xs-9">
                                    <input class="form-control" type="number" id="brokerageFee" name="brokerageFee">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-xs-3">Loại tòa nhà</label>
                                <div class="col-xs-3">
                                    <label class="checkbox-inline">
                                        <input type="checkbox" name="typeCode" value="noi-that">Nội thất
                                    </label>
                                    <label class="checkbox-inline">
                                        <input type="checkbox" name="typeCode" value="nguyen-can">Nguyên căn
                                    </label>
                                    <label class="checkbox-inline">
                                        <input type="checkbox" name="typeCode" value="tang-tret">Tầng trệt
                                    </label>
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-xs-3">Ghi chú</label>
                                <div class="col-xs-9">
                                    <input class="form-control" type="number" id="note" name="note">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-xs-3">Hình ảnh</label>
                                <div class="col-xs-3">
                                    <input class="form-control" type="file" id="image" name="image">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-xs-3"></label>
                                <div class="col-xs-9">
                                    <button class="btn btn-info" type="button" id="btnAddBuilding">
                                        <i class="ace-icon fa fa-check bigger-110"></i>
                                        Thêm tòa nhà
                                    </button>
                                    <button class="btn btn-danger" type="button">
                                        <i class="ace-icon fa fa-times"></i>
                                        Hủy thao tác
                                    </button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>

            </div><!-- /.page-content -->
        </div><!-- /.main-content -->
</div><!-- /.main-container -->
</body>
</html>
