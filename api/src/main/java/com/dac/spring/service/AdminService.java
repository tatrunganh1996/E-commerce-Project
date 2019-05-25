//package com.dac.spring.service;
//
//import com.dac.spring.model.ServiceResult;
//import com.dac.spring.model.req.AdminCreateCampaignRequest;
//import com.dac.spring.model.req.AdminCreateProductRequest;
//import com.dac.spring.model.req.AdminUpdateCampaignRequest;
//import com.dac.spring.model.req.ShopUpdateProductRequest;
//
//public interface AdminService {
//    ServiceResult getAllCustomer();
//    ServiceResult getCustomerById(int id);
//    ServiceResult updateUser(int id, String firstName, String lastName, String password, String imageURL, String statusName, String roleName);
//    ServiceResult deleteUserById(int id);
//    ServiceResult createEmployee(String firstName, String lastName, String email, String password, String imageURL, String statusName, String roleName);
//    ServiceResult signupAdmin(String firstName, String lastName, String email, String password);
//    ServiceResult paginateUser(int page, int size);
//    ServiceResult createCategory(String name, int parentID, int limit);
//    ServiceResult updateCategory(int id, String name, String parentName);
//    ServiceResult paginateCategory(int page, int size);
//    ServiceResult deleteCategory(int id);
//    ServiceResult paginateProduct(int page, int size);
//    ServiceResult createProduct(AdminCreateProductRequest request);
//    ServiceResult updateProduct(ShopUpdateProductRequest request);
//    ServiceResult deleteProduct(int id);
//    ServiceResult deleteOrderDetail(int id);
//    ServiceResult deleteOrder(int id);
//    ServiceResult paginateOrder(int page, int size);
//    ServiceResult paginateOrderDetail(int id, int page, int size);
//    ServiceResult createOrderDetail(int id, int quantity, int productID, int orderID);
//    ServiceResult getAllShop();
//    ServiceResult paginateCampaign(int page, int size);
//    ServiceResult createCampaign(AdminCreateCampaignRequest request);
//    ServiceResult updateCampaign(AdminUpdateCampaignRequest request);
//    ServiceResult deleteCampaign(int id);
//}
