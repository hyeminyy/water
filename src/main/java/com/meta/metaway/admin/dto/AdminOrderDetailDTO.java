package com.meta.metaway.admin.dto;

import java.time.LocalDateTime;

import com.meta.metaway.admin.util.DateUtil;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdminOrderDetailDTO {
	private long orderDetailId;
	private long orderId;
	private long contractId;
	private long productId;
	private int orderCount;
	private LocalDateTime startDate;
	private LocalDateTime endDate;
	private int stateType;
	// order
	private String orderName;
	private String orderAddress;
	private String orderContent;
	private int orderPrice;
	private int rentalPrice;
	private LocalDateTime orderDate;
	private LocalDateTime requestDate;
	// product
	private String productModel;
	private String productName;
	// contract
	private int contractYear;
	private int contractPrice;
	// user
	private String userPhone;

	// staff
	private long staffId;
	private String workPlace;
	// schedule
	private long scheduleId;

	// 날짜 포맷
	public String getOrderDate() {
		return DateUtil.formatLocalDateTime(orderDate);
	}

	public String getStartDate() {
		return DateUtil.formatLocalDateTime(startDate);
	}

	public String getEndDate() {
		return DateUtil.formatLocalDateTime(endDate);
	}

	public String getRequestDate() {
		return DateUtil.formatLocalDateTime(requestDate);
	}

	public String getStateType() {
		if (stateType == 2) {
			return "반납 신청";
		} else if (stateType == 3) {
			return "해지 신청";
		} else if (stateType == 4) {
			return "환불 신청";
		} else if (stateType == 5) {
			return "반납 완료";
		} else if (stateType == 6) {
			return "해지 완료";
		} else if (stateType == 7) {
			return "환불 완료";
		} else {
			return null;
		}
	}

}
