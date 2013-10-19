
<body>

	<div class="navbar navbar-inverse navbar-fixed-top">


		<div class="navbar-inner">
			<div class="container">
				<button type="button" class="btn btn-navbar" data-toggle="collapse"
					data-target=".nav-collapse">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<div class="nav-collapse collapse">
					<ul class="nav pull-left">
						<li><a href="<%= request.getContextPath() %>">Home</a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>


	<div class="container pagination-centered">

		<h1>Human Chromosome Mapping</h1>
		
		<div class="row">
		<div class="span5 well offset3">
		<%@ include file="/WEB-INF/loginform.jspf"%>
		</div>
		</div>
	</div>
	<!-- /container -->

</body>
</html>
