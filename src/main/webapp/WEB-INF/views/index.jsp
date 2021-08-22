<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%@ include file="header.jsp"%>

<section id="hero" class="d-flex justify-cntent-center align-items-center">
	<div id="heroCarousel" class="container carousel carousel-fade" data-ride="carousel">
		<div class="carousel-item active sidebar">
			<div class="carousel-container">
				<h2 class="animate__animated animate__fadeInDown">
					어디로 <span>여행</span> 가세요?
				</h2>

				<form action="" method="GET">
					<div class="mx-auto mt-5 search-bar input-group mb-3">
						<input size="50%" name="search" type="text" class="form-control rounded-pill" placeholder="" aria-label="Recipient's username" aria-describedby="button-addon2" autofocus>
						<div class="input-group-append"></div>
					</div>
				</form>
				
				<br/><br/>
				<a href="" class="btn-get-started animate__animated animate__fadeInUp">Read More</a>
			</div>
		</div>
	</div>
</section>

<main id="main">
	<section class="service-details">
		<div class="container">
			<div class="row">
			
				<c:forEach items="${travelList}" var="travel">
					<div class="col-md-4 d-flex align-items-stretch" data-aos="fade-up">
						<div class="card">
							<div class="card-img">
								<img src="/resources/assets/img/test.jfif" alt="...">
							</div>
							<div class="card-body">
								<h5 class="card-title">
									<a href="/traveldetail/${travel.trv_no}">${travel.title }</a>
								</h5>
								<p class="card-text">${travel.remark }</p>
								<div class="read-more">
									<a href="#"><i class="icofont-arrow-right"></i> Read More</a>
								</div>
							</div>
						</div>
					</div>
				</c:forEach>
				
			</div>
		</div>
	</section>
</main>
<!-- End #main -->

<%@ include file="footer.jsp"%>