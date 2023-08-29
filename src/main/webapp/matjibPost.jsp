<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="UTF-8">
<head>
    <meta charset="UTF-8">
    <title>K-Koding 맛집 리스트도 | Main</title>
    <script type="text/javascript"
            src="https://openapi.map.naver.com/openapi/v3/maps.js?ncpClientId=j7f8jzk31x&submodules=geocoder"></script>

    <!-- favicon.ico 404 (Not Found) -->
    <link rel="icon" href="data:;base64,iVBORw0KGgo=">

    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Jua&family=Sunflower:wght@300&display=swap" rel="stylesheet">
    <!-- Bulma CSS링크 -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bulma@0.9.1/css/bulma.min.css">
    <!-- Font Awesome CSS -->
    <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <!-- jQuery -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-cookie/1.4.1/jquery.cookie.js"></script>
    <style>
        * {
            margin: 0;
            padding: 0;
            font-family: 'Jua', sans-serif;

        }

        /* container 영역 */
        .box {
            width: 1000px;
            height: 1000px;
            margin: 0 auto;
        }

        /* header 영역 */
        .navbar {
            border-bottom: 1px solid #e8e8e8;
        }

        .navbar-start {
            padding-left: 250px;
            font-weight: 500;
            font-size: 20px;
        }

        .navbar-item {
            font-size: 25px;
            font-weight: 500;
        }

        /* contents 역 */
        .Main {
            padding-top: 50px;
            margin-left: 200px;
        }

        .control {
            width: 500px;
        }

        #button_save {
            margin-top: 20px;
            margin-left: 200px;
            padding: 30px;
            border-radius: 20px;
            font-size: 20px;
            font-weight: 500;
        }

        .buttons {
            width: 100%;
        }

        .button {
            font-size: 15px;

        }
    </style>
    <script>
        function posting() {
            let title = $('#title').val()
            let menu = $('#menu').val()
            let address = $('#address').val()
            let desc = $('#desc').val()

        $.ajax({
            type: "POST",
            url: "/mymatjip",
            data: {title_give: title, menu_give: menu, address_give: address, desc_give: desc,},
            success: function (response) {
                alert(response['msg'])
                window.location.reload()
            }
        })
        }
    </script>
</head>
<body>
<div class="box">
    <nav class="navbar" role="navigation" aria-label="main navigation">
        <div class="navbar-brand">
            <a class="navbar-item" href="matjibLogin.jsp">
                너가 좋아
            </a>
        </div>
        <div id="navbarBasicExample" class="navbar-menu">
            <div class="navbar-start">
               <a href="placeList2.jsp" class="navbar-item">
	                    맛집 찾기
	                </a>
	                <a href="matjibPost.jsp" class="navbar-item">
	                    맛집 추천
	                </a>
            </div>
        </div>
    </nav>
    <div class="Main">
        <div class="inputBox">
            <div class="field">
                <label class="label">맛집이름</label>
                <div class="control">
                    <input class="input is-link" id="title" type="text" placeholder="내가아는 맛집 공유하기!">
                </div>
            </div>
            <div class="field">
                <label class="label">대표메뉴 & 꿀조합</label>
                <div class="control">
                    <input class="input is-link" id="menu" type="email" placeholder="이건 무조건 먹어야해!">
                </div>
            </div>
            <div class="field">
                <label class="label">주소</label>
                <div class="control">
                    <input class="input is-link" id="address" type="email" placeholder="정확한 주소를 입력 & 지역+상호명을 입력해주세요!">
                </div>
            </div>
            <div class="field">
                <label class="label">추천이유</label>
                <div class="control">
                    <textarea class="textarea is-link" id="desc" placeholder="대체 무엇이 맛있길래 또 방문 하는 것인가!"></textarea>
                </div>
            </div>
        </div>
        <div class="buttons">
            <button onclick="posting()" id="button_save" class="button is-link is-light">저장하기</button>
        </div>
    </div>

</div>
</body>
</html>