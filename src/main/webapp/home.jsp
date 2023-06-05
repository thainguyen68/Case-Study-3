<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/meyer-reset/2.0/reset.min.css"
          integrity="sha512-NmLkDIU1C/C88wi324HBc+S2kLhi08PN5GDeUVVVC/BVt/9Izdsc9SVeVfA1UZbY3sHUlDSyRXhCzHfr6hmPPw=="
          crossorigin="anonymous" referrerpolicy="no-referrer"/>
    <link rel="stylesheet" href=" https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css">
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500;700;900&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="./asset/font/themify-icons/themify-icons.css">
    <link rel="stylesheet" href="./asset/css/base.css">

    <link rel="stylesheet" href="asset/css/home.css">
    <link rel="stylesheet" href="asset/css/responsiveNew.css">
    <link rel="icon" href="asset/img/favicon.png">
    <title>Instagram</title>
</head>
<body>
<div class="main">
    <header class="header">
        <nav class="header__navbar">
            <div class="header__navbar-logo">
                <a href="/home" class="header__navbar-logo__link">
                    <div class="header__navbar-logo-img">
                        <img src="./asset/img/instagram-text.svg" alt="">
                    </div>
                </a>
            </div>
            <form method="post" action="">
                <div class="header__navbar-search">
                    <div class="header__navbar-search-container">
                        <input class="search_input" type="text" placeholder="Search">
                        <button type="submit"><i class="ti-search"></i></button>
                    </div>

                    <div class="search_iput__btn">
                        <div class="search_btn">
                            <span class="search_btn-icon">
                                <i class="ti-search"></i>
                            </span>
                            <span class="search_btn-text">Search</span>
                        </div>
                    </div>
                </div>
            </form>

            <ul class="header__navbar-list">
                <li class="header__navbar-item">
                    <a href="#" class="header__nabar-link">
                        <svg aria-label="Home" class="_8-yf5 " color="#262626" fill="#262626" height="22" role="img"
                             viewBox="0 0 48 48" width="22">
                            <path d="M45.5 48H30.1c-.8 0-1.5-.7-1.5-1.5V34.2c0-2.6-2.1-4.6-4.6-4.6s-4.6 2.1-4.6 4.6v12.3c0 .8-.7 1.5-1.5 1.5H2.5c-.8 0-1.5-.7-1.5-1.5V23c0-.4.2-.8.4-1.1L22.9.4c.6-.6 1.6-.6 2.1 0l21.5 21.5c.3.3.4.7.4 1.1v23.5c.1.8-.6 1.5-1.4 1.5z"></path>
                        </svg>
                        <svg aria-label="Home" class="_8-yf5 outHome " color="#262626" fill="#262626" height="22"
                             role="img" viewBox="0 0 48 48" width="22">
                            <path d="M45.3 48H30c-.8 0-1.5-.7-1.5-1.5V34.2c0-2.6-2-4.6-4.6-4.6s-4.6 2-4.6 4.6v12.3c0 .8-.7 1.5-1.5 1.5H2.5c-.8 0-1.5-.7-1.5-1.5V23c0-.4.2-.8.4-1.1L22.9.4c.6-.6 1.5-.6 2.1 0l21.5 21.5c.4.4.6 1.1.3 1.6 0 .1-.1.1-.1.2v22.8c.1.8-.6 1.5-1.4 1.5zm-13.8-3h12.3V23.4L24 3.6l-20 20V45h12.3V34.2c0-4.3 3.3-7.6 7.6-7.6s7.6 3.3 7.6 7.6V45z"></path>
                        </svg> <!-- home này hiện khi ko ở trang home -->
                    </a>
                </li>
                <li class="header__navbar-item">
                    <a href="" class="header__nabar-link">
                        <img class="img-svg-search" src="./asset/img/icons8-search.svg" alt="">
                    </a>
                </li>
                <li class="header__navbar-item">
                    <a href="" class="header__nabar-link">
                        <img class="img-svg-video" src="./asset/img/icons8-instagram-reels.svg" alt="">
                    </a>
                </li>
                <li class="header__navbar-item isnone">
                    <a href="" class="header__nabar-link dot-notify">
                        <svg aria-label="Messenger" class="_8-yf5 " color="#262626" fill="#262626" height="22"
                             role="img" viewBox="0 0 48 48" width="22">
                            <path d="M36.2 16.7L29 22.2c-.5.4-1.2.4-1.7 0l-5.4-4c-1.6-1.2-3.9-.8-5 .9l-6.8 10.7c-.7 1 .6 2.2 1.6 1.5l7.3-5.5c.5-.4 1.2-.4 1.7 0l5.4 4c1.6 1.2 3.9.8 5-.9l6.8-10.7c.6-1.1-.7-2.2-1.7-1.5zM24 1C11 1 1 10.5 1 23.3 1 30 3.7 35.8 8.2 39.8c.4.3.6.8.6 1.3l.2 4.1c0 1 .9 1.8 1.8 1.8.2 0 .5 0 .7-.2l4.6-2c.2-.1.5-.2.7-.2.2 0 .3 0 .5.1 2.1.6 4.3.9 6.7.9 13 0 23-9.5 23-22.3S37 1 24 1zm0 41.6c-2 0-4-.3-5.9-.8-.4-.1-.8-.2-1.3-.2-.7 0-1.3.1-2 .4l-3 1.3V41c0-1.3-.6-2.5-1.6-3.4C6.2 34 4 28.9 4 23.3 4 12.3 12.6 4 24 4s20 8.3 20 19.3-8.6 19.3-20 19.3z"></path>
                        </svg>
                    </a>
                </li>
                <li class="header__navbar-item isnone">
                    <a href="" class="header__nabar-link">
                        <input type="checkbox" hidden class="newpost-on-off" id="newpost-on-off-id">
                        <label for="newpost-on-off-id" class="newpost-off">
                            <svg aria-label="New Post" class="_8-yf5 " color="#262626" fill="#262626" height="22"
                                 role="img" viewBox="0 0 48 48" width="22">
                                <path d="M31.8 48H16.2c-6.6 0-9.6-1.6-12.1-4C1.6 41.4 0 38.4 0 31.8V16.2C0 9.6 1.6 6.6 4 4.1 6.6 1.6 9.6 0 16.2 0h15.6c6.6 0 9.6 1.6 12.1 4C46.4 6.6 48 9.6 48 16.2v15.6c0 6.6-1.6 9.6-4 12.1-2.6 2.5-5.6 4.1-12.2 4.1zM16.2 3C10 3 7.8 4.6 6.1 6.2 4.6 7.8 3 10 3 16.2v15.6c0 6.2 1.6 8.4 3.2 10.1 1.6 1.6 3.8 3.1 10 3.1h15.6c6.2 0 8.4-1.6 10.1-3.2 1.6-1.6 3.1-3.8 3.1-10V16.2c0-6.2-1.6-8.4-3.2-10.1C40.2 4.6 38 3 31.8 3H16.2z"></path>
                                <path d="M36.3 25.5H11.7c-.8 0-1.5-.7-1.5-1.5s.7-1.5 1.5-1.5h24.6c.8 0 1.5.7 1.5 1.5s-.7 1.5-1.5 1.5z"></path>
                                <path d="M24 37.8c-.8 0-1.5-.7-1.5-1.5V11.7c0-.8.7-1.5 1.5-1.5s1.5.7 1.5 1.5v24.6c0 .8-.7 1.5-1.5 1.5z"></path>
                            </svg>
                        </label>
                        <label for="newpost-on-off-id" class="newpost-on">
                            <svg aria-label="New Post" class="_8-yf5 " color="#262626" fill="#262626" height="22"
                                 role="img" viewBox="0 0 48 48" width="22">
                                <path d="M43.9 4c-2.5-2.4-5.5-4-12.2-4H16.2C9.6 0 6.6 1.6 4 4.1 1.6 6.6 0 9.6 0 16.2v15.5c0 6.6 1.6 9.7 4.1 12.2 2.5 2.4 5.5 4 12.2 4h15.5c6.6 0 9.7-1.6 12.2-4.1 2.4-2.5 4-5.5 4-12.2V16.2c0-6.6-1.6-9.6-4.1-12.2zm-7.6 21.5H25.5v10.8c0 .8-.7 1.5-1.5 1.5s-1.5-.7-1.5-1.5V25.5H11.7c-.8 0-1.5-.7-1.5-1.5s.7-1.5 1.5-1.5h10.8V11.7c0-.8.7-1.5 1.5-1.5s1.5.7 1.5 1.5v10.8h10.8c.8 0 1.5.7 1.5 1.5s-.7 1.5-1.5 1.5z"></path>
                            </svg>
                        </label>
                        <label for="newpost-on-off-id" class="createnew-wrapper">
                            <!-- làm tiếp đoạn này -->
                            <div class="createnew-inner">
                                <!-- làm tiếp đoạn này là để Create -->
                            </div>
                        </label>
                    </a>
                </li>
                <li class="header__navbar-item isnone">
                    <a href="" class="header__nabar-link">
                        <svg aria-label="Find People" class="_8-yf5 " color="#262626" fill="#262626" height="22"
                             role="img" viewBox="0 0 48 48" width="22">
                            <path clip-rule="evenodd"
                                  d="M24 0C10.8 0 0 10.8 0 24s10.8 24 24 24 24-10.8 24-24S37.2 0 24 0zm0 45C12.4 45 3 35.6 3 24S12.4 3 24 3s21 9.4 21 21-9.4 21-21 21zm10.2-33.2l-14.8 7c-.3.1-.6.4-.7.7l-7 14.8c-.3.6-.2 1.3.3 1.7.3.3.7.4 1.1.4.2 0 .4 0 .6-.1l14.8-7c.3-.1.6-.4.7-.7l7-14.8c.3-.6.2-1.3-.3-1.7-.4-.5-1.1-.6-1.7-.3zm-7.4 15l-5.5-5.5 10.5-5-5 10.5z"
                                  fill-rule="evenodd"></path>
                        </svg>
                    </a>
                </li>
                <li class="header__navbar-item">
                    <a href="#" class="header__nabar-link">
                        <input type="checkbox" class="notifies-on-off" id="notifies-on-off-id">
                        <label for="notifies-on-off-id" class="notifies-off">
                            <svg aria-label="Activity Feed" class="_8-yf5 " color="#262626" fill="#262626" height="22"
                                 role="img" viewBox="0 0 48 48" width="22">
                                <path d="M34.6 6.1c5.7 0 10.4 5.2 10.4 11.5 0 6.8-5.9 11-11.5 16S25 41.3 24 41.9c-1.1-.7-4.7-4-9.5-8.3-5.7-5-11.5-9.2-11.5-16C3 11.3 7.7 6.1 13.4 6.1c4.2 0 6.5 2 8.1 4.3 1.9 2.6 2.2 3.9 2.5 3.9.3 0 .6-1.3 2.5-3.9 1.6-2.3 3.9-4.3 8.1-4.3m0-3c-4.5 0-7.9 1.8-10.6 5.6-2.7-3.7-6.1-5.5-10.6-5.5C6 3.1 0 9.6 0 17.6c0 7.3 5.4 12 10.6 16.5.6.5 1.3 1.1 1.9 1.7l2.3 2c4.4 3.9 6.6 5.9 7.6 6.5.5.3 1.1.5 1.6.5.6 0 1.1-.2 1.6-.5 1-.6 2.8-2.2 7.8-6.8l2-1.8c.7-.6 1.3-1.2 2-1.7C42.7 29.6 48 25 48 17.6c0-8-6-14.5-13.4-14.5z"></path>
                            </svg>
                        </label>
                        <label for="notifies-on-off-id" class="notifies-on">
                            <svg aria-label="Activity Feed" class="_8-yf5 " color="#262626" fill="#262626" height="22"
                                 role="img" viewBox="0 0 48 48" width="22">
                                <path d="M34.6 3.1c-4.5 0-7.9 1.8-10.6 5.6-2.7-3.7-6.1-5.5-10.6-5.5C6 3.1 0 9.6 0 17.6c0 7.3 5.4 12 10.6 16.5.6.5 1.3 1.1 1.9 1.7l2.3 2c4.4 3.9 6.6 5.9 7.6 6.5.5.3 1.1.5 1.6.5s1.1-.2 1.6-.5c1-.6 2.8-2.2 7.8-6.8l2-1.8c.7-.6 1.3-1.2 2-1.7C42.7 29.6 48 25 48 17.6c0-8-6-14.5-13.4-14.5z"></path>
                            </svg>
                        </label>
                        <!-- ---thông báo hiện tại có -->
                        <div class="notifies-wrapper-location">
                            <div class="notifies-wrapper">
                                <div class="notifies-inner-o">
                                    <div class="notifies-inner-o__ava">
                                            <span class="notifies-inner-o__ava-1" style="height: 32px; width: 32px;">
                                                <img src="./asset/img/ava.jpg" alt=""
                                                     style="height: 100%; width: 100%;">
                                            </span>
                                        <span class="notifies-inner-o__ava-2" style="height: 32px; width: 32px;">
                                                <img src="./asset/img/ava.jpg" alt=""
                                                     style="height: 100%; width: 100%;">
                                            </span>
                                    </div>
                                    <div class="notifies-inner-o__about">
                                        <h4>Follow Requests</h4>
                                        <span>thainguyenn__ + 135 others</span>
                                    </div>
                                    <div class="notifies-inner-o__icon">
                                        <div class="notifies-inner-o__icon-point">
                                            <div style="height:8px; width:8px; background-color:#0095f6;"></div>
                                        </div>
                                        <div class="notifies-inner-o__icon-link">
                                            <i class="fas fa-chevron-right"
                                               style="font-size: 1.6rem; line-height: 3.6rem;"></i>
                                        </div>
                                    </div>
                                </div>
                                <div class="notifies-inner-u">
                                    <div class="notifies-inner-u__event">
                                        <div class="notifies-inner-u__event-time">Earlier</div>
                                        <div class="notifies-inner-u__event-about">
                                            <div class="notifies-inner-u__event-about__ava"
                                                 style="width: 44px; height: 44px; overflow: hidden;">
                                                <img src="./asset/img/ava.jpg" alt=""
                                                     style="height: 100%; width: 100%;">
                                            </div>
                                            <div class="notifies-inner-u__event-about__name">
                                                <div class="notifies-inner-u__event-about__name-acc">
                                                    <span class="">
                                                            thainguyenn__
                                                        </span>
                                                    <span class="notifies-inner-u__event-about__name-active">
                                                            started following you.
                                                        </span>
                                                </div>
                                                <span>6w</span>
                                            </div>
                                            <div class="btn notifies-inner-u__event-about__btn">Following</div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </a>
                </li>


                <%--------------------------------Ở ĐÂY LÀ XỬ LÝ PHẦN AVATAR--------------------------------------------------------------%>

                <li class="header__navbar-item accountfolder-shows">
                    <a href="#" class="header__nabar-link">
                        <div class="border-img">
                                <span class="header__navbar-ava">
                                    <img class="ava-img" src="./asset/img/ava.jpg" alt="">
                                </span>
                        </div>
                    </a>

                    <!-- account folder/ thư mục tài khoản -->
                    <div class="accountfolder">
                        <div class="accountfolder-wraper">
                            <div class="accountfolder-inner">
                                <div class="accountfolder-about btn">
                                    <div class="accountfolder-about__icon">
                                        <svg aria-label="Profile" class="_8-yf5 " color="#262626" fill="#262626"
                                             height="16" role="img" viewBox="0 0 32 32" width="16">
                                            <path d="M16 0C7.2 0 0 7.1 0 16c0 4.8 2.1 9.1 5.5 12l.3.3C8.5 30.6 12.1 32 16 32s7.5-1.4 10.2-3.7l.3-.3c3.4-3 5.5-7.2 5.5-12 0-8.9-7.2-16-16-16zm0 29c-2.8 0-5.3-.9-7.5-2.4.5-.9.9-1.3 1.4-1.8.7-.5 1.5-.8 2.4-.8h7.2c.9 0 1.7.3 2.4.8.5.4.9.8 1.4 1.8-2 1.5-4.5 2.4-7.3 2.4zm9.7-4.4c-.5-.9-1.1-1.5-1.9-2.1-1.2-.9-2.7-1.4-4.2-1.4h-7.2c-1.5 0-3 .5-4.2 1.4-.8.6-1.4 1.2-1.9 2.1C4.2 22.3 3 19.3 3 16 3 8.8 8.8 3 16 3s13 5.8 13 13c0 3.3-1.2 6.3-3.3 8.6zM16 5.7c-3.9 0-7 3.1-7 7s3.1 7 7 7 7-3.1 7-7-3.1-7-7-7zm0 11c-2.2 0-4-1.8-4-4s1.8-4 4-4 4 1.8 4 4-1.8 4-4 4z"></path>
                                        </svg>
                                    </div>
                                    <div class="accountfolder-about-content">
                                        <div class="accountfolder-about-content__Profile">
                                            <a style="text-decoration: none;color: #262626" href="/user?action=update&id=${user.id}">Profile</a>
                                        </div>
                                    </div>
                                </div>
                                <div class="accountfolder-about btn">
                                    <div class="accountfolder-about__icon">
                                        <svg aria-label="Saved" class="_8-yf5 " color="#262626" fill="#262626"
                                             height="16" role="img" viewBox="0 0 32 32" width="16">
                                            <path d="M28.7 32c-.4 0-.8-.2-1.1-.4L16 19.9 4.4 31.6c-.4.4-1.1.6-1.6.3-.6-.2-.9-.8-.9-1.4v-29C1.8.7 2.5 0 3.3 0h25.4c.8 0 1.5.7 1.5 1.5v29c0 .6-.4 1.2-.9 1.4-.2.1-.4.1-.6.1zM4.8 3v23.9l9.4-9.4c.9-.9 2.6-.9 3.5 0l9.4 9.4V3H4.8z"></path>
                                        </svg>
                                    </div>
                                    <div class="accountfolder-about-content">
                                        <div class="accountfolder-about-content__Saved">Saved</div>
                                    </div>
                                </div>
                                <div class="accountfolder-about btn">
                                    <div class="accountfolder-about__icon">
                                        <svg aria-label="Settings" class="_8-yf5 " color="#262626" fill="#262626"
                                             height="16" role="img" viewBox="0 0 32 32" width="16">
                                            <path d="M31.2 13.4l-1.4-.7c-.1 0-.2-.1-.2-.2v-.2c-.3-1.1-.7-2.1-1.3-3.1v-.1l-.2-.1v-.3l.5-1.5c.2-.5 0-1.1-.4-1.5l-1.9-1.9c-.4-.4-1-.5-1.5-.4l-1.5.5H23l-.1-.1h-.1c-1-.5-2-1-3.1-1.3h-.2c-.1 0-.1-.1-.2-.2L18.6.9c-.2-.5-.7-.9-1.2-.9h-2.7c-.5 0-1 .3-1.3.8l-.7 1.4c0 .1-.1.2-.2.2h-.2c-1.1.3-2.1.7-3.1 1.3h-.1l-.1.2h-.3l-1.5-.5c-.5-.2-1.1 0-1.5.4L3.8 5.7c-.4.4-.5 1-.4 1.5l.5 1.5v.5c-.5 1-1 2-1.3 3.1v.2c0 .1-.1.1-.2.2l-1.4.7c-.6.2-1 .7-1 1.2v2.7c0 .5.3 1 .8 1.3l1.4.7c.1 0 .2.1.2.2v.2c.3 1.1.7 2.1 1.3 3.1v.1l.2.1v.3l-.5 1.5c-.2.5 0 1.1.4 1.5l1.9 1.9c.3.3.6.4 1 .4.2 0 .3 0 .5-.1l1.5-.5H9l.1.1h.1c1 .5 2 1 3.1 1.3h.2c.1 0 .1.1.2.2l.7 1.4c.2.5.7.8 1.3.8h2.7c.5 0 1-.3 1.3-.8l.7-1.4c0-.1.1-.2.2-.2h.2c1.1-.3 2.1-.7 3.1-1.3h.1l.1-.1h.3l1.5.5c.1 0 .3.1.5.1.4 0 .7-.1 1-.4l1.9-1.9c.4-.4.5-1 .4-1.5l-.5-1.5V23l.1-.1v-.1c.5-1 1-2 1.3-3.1v-.2c0-.1.1-.1.2-.2l1.4-.7c.5-.2.8-.7.8-1.3v-2.7c0-.5-.4-1-.8-1.2zM16 27.1c-6.1 0-11.1-5-11.1-11.1S9.9 4.9 16 4.9s11.1 5 11.1 11.1-5 11.1-11.1 11.1z"></path>
                                        </svg>
                                    </div>
                                    <div class="accountfolder-about-content">
                                        <div class="accountfolder-about-content__Settings">Settings</div>
                                    </div>
                                </div>
                                <div class="accountfolder-about btn">
                                    <div class="accountfolder-about__icon">
                                        <svg aria-label="Switch Accounts" class="_8-yf5 " color="#262626" fill="#262626"
                                             height="16" role="img" viewBox="0 0 32 32" width="16">
                                            <path d="M10.3 10.7c0-.8-.7-1.5-1.5-1.5H4.9C7.2 5.4 11.4 3 16 3c3.6 0 7 1.5 9.5 4.1.5.6 1.5.6 2.1.1.6-.6.6-1.5.1-2.1-3-3.2-7.3-5-11.7-5C10.7 0 6 2.5 3 6.7V3.5C3 2.7 2.3 2 1.5 2S0 2.7 0 3.5v7.2c0 .8.7 1.5 1.5 1.5h7.3c.8 0 1.5-.6 1.5-1.5zm20.2 9.1h-7.2c-.8 0-1.5.7-1.5 1.5s.7 1.5 1.5 1.5h3.8C24.8 26.6 20.6 29 16 29c-3.6 0-7-1.5-9.5-4.1-.5-.6-1.5-.6-2.1-.1-.6.6-.6 1.5-.1 2.1 3 3.2 7.3 5 11.7 5 5.3 0 10-2.5 13-6.7v3.2c0 .8.7 1.5 1.5 1.5s1.5-.7 1.5-1.5v-7.2c0-.8-.7-1.4-1.5-1.4z"></path>
                                        </svg>
                                    </div>
                                    <div class="accountfolder-about-content">
                                        <div class="accountfolder-about-content__SwitchAcc">Switch Accounts</div>
                                    </div>
                                </div>
                                <div class="accountfolder-about btn mb-4">

                 <%-----------------------------------Ở ĐÂY XỬ LÝ PẦN LOG-OUT---------------------------------------------------------%>

                                    <div class="accountfolder-about__logOut">
                                        <div class="accountfolder-about__logOut-inner">
                                            <a style="text-decoration: none; color: #8c4343" href="/login">Log Out</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </li>
            </ul>
        </nav>
    </header>

    <!-- container/content -->
    <div class="grid">
        <div class="content">
            <div class="content-main">
                <div class="slider">
                    <div class="slider__story">
                        <ul class="slider__story-list">
                            <li class="slider__story-item">
                                <div class="story-container">
                                    <button class="story-about">
                                            <span class="story-about-inner">
                                                <img src="./asset/img/ava.jpg" alt="" class="story-img">
                                            </span>
                                        <div class="story-of">thainguyenn__</div>
                                    </button>
                                </div>
                            </li>
                            <li class="slider__story-item">
                                <div class="story-container">
                                    <button class="story-about">
                                            <span class="story-about-inner">
                                                <img src="./asset/img/ava.jpg" alt="" class="story-img">
                                            </span>
                                        <div class="story-of">thainguyenn__</div>
                                    </button>
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>



        <%-----------------------------------------xử lý avatar bài viết--Và--phần tên tk--------------------------------------------------%>

                <section class="content-main__wrapper">
                    <div class="content-main__inner">
                        <div class="content-main__heading">
                            <header class="heading-inner">
                                <div class="heading-inner__ava">
                                    <img src="./asset/img/ava.jpg" alt="" class="heading-inner__ava-img">
                                </div>
                                <div>thainguyenn__</div>
                            </header>
                            <div class="heading-icon">
                                        <span class="heading-icon__inner">
                                            <svg aria-label="More options" class="_8-yf5 " color="#262626"
                                                 fill="#262626" height="24" role="img" viewBox="0 0 24 24" width="24"><circle
                                                    cx="12" cy="12" r="1.5"></circle><circle cx="6.5" cy="12"
                                                                                             r="1.5"></circle><circle
                                                    cx="17.5" cy="12" r="1.5"></circle>
                                            </svg>
                                        </span>

                                    <div>

                                    </div>

                            </div>
                        </div>
                        <div class="content-main__content">
                            <div class="content-main__content-img">
                                <img class="content-img"
                                     src="./asset/img/content1/patrick-tomasso-n-vxsHr9jZA-unsplash.jpg">
                            </div>
                        </div>

                        <div class="content-main__about">
                            <div class="abut-operation">
                                <ul class="operation-list">
                                    <li class="operation-item operation-item-js  liked">
                                        <svg aria-label="Like" class="_8-yf5 unlike " color="#262626" fill="#262626"
                                             height="24" role="img" viewBox="0 0 48 48" width="24">
                                            <path d="M34.6 6.1c5.7 0 10.4 5.2 10.4 11.5 0 6.8-5.9 11-11.5 16S25 41.3 24 41.9c-1.1-.7-4.7-4-9.5-8.3-5.7-5-11.5-9.2-11.5-16C3 11.3 7.7 6.1 13.4 6.1c4.2 0 6.5 2 8.1 4.3 1.9 2.6 2.2 3.9 2.5 3.9.3 0 .6-1.3 2.5-3.9 1.6-2.3 3.9-4.3 8.1-4.3m0-3c-4.5 0-7.9 1.8-10.6 5.6-2.7-3.7-6.1-5.5-10.6-5.5C6 3.1 0 9.6 0 17.6c0 7.3 5.4 12 10.6 16.5.6.5 1.3 1.1 1.9 1.7l2.3 2c4.4 3.9 6.6 5.9 7.6 6.5.5.3 1.1.5 1.6.5.6 0 1.1-.2 1.6-.5 1-.6 2.8-2.2 7.8-6.8l2-1.8c.7-.6 1.3-1.2 2-1.7C42.7 29.6 48 25 48 17.6c0-8-6-14.5-13.4-14.5z"></path>
                                        </svg>
                                        <svg aria-label="Unlike" class="_8-yf5 like " color="#ed4956" fill="#ed4956"
                                             height="24" role="img" viewBox="0 0 48 48" width="24">
                                            <path d="M34.6 3.1c-4.5 0-7.9 1.8-10.6 5.6-2.7-3.7-6.1-5.5-10.6-5.5C6 3.1 0 9.6 0 17.6c0 7.3 5.4 12 10.6 16.5.6.5 1.3 1.1 1.9 1.7l2.3 2c4.4 3.9 6.6 5.9 7.6 6.5.5.3 1.1.5 1.6.5s1.1-.2 1.6-.5c1-.6 2.8-2.2 7.8-6.8l2-1.8c.7-.6 1.3-1.2 2-1.7C42.7 29.6 48 25 48 17.6c0-8-6-14.5-13.4-14.5z"></path>
                                        </svg>
                                    </li>
                                    <li class="operation-item">
                                        <svg aria-label="Comment" class="_8-yf5 " color="#262626" fill="#262626"
                                             height="24" role="img" viewBox="0 0 48 48" width="24">
                                            <path clip-rule="evenodd"
                                                  d="M47.5 46.1l-2.8-11c1.8-3.3 2.8-7.1 2.8-11.1C47.5 11 37 .5 24 .5S.5 11 .5 24 11 47.5 24 47.5c4 0 7.8-1 11.1-2.8l11 2.8c.8.2 1.6-.6 1.4-1.4zm-3-22.1c0 4-1 7-2.6 10-.2.4-.3.9-.2 1.4l2.1 8.4-8.3-2.1c-.5-.1-1-.1-1.4.2-1.8 1-5.2 2.6-10 2.6-11.4 0-20.6-9.2-20.6-20.5S12.7 3.5 24 3.5 44.5 12.7 44.5 24z"
                                                  fill-rule="evenodd"></path>
                                        </svg>
                                    </li>
                                    <li class="operation-item">
                                        <svg aria-label="Share Post" class="_8-yf5 " color="#262626" fill="#262626"
                                             height="24" role="img" viewBox="0 0 48 48" width="24">
                                            <path d="M47.8 3.8c-.3-.5-.8-.8-1.3-.8h-45C.9 3.1.3 3.5.1 4S0 5.2.4 5.7l15.9 15.6 5.5 22.6c.1.6.6 1 1.2 1.1h.2c.5 0 1-.3 1.3-.7l23.2-39c.4-.4.4-1 .1-1.5zM5.2 6.1h35.5L18 18.7 5.2 6.1zm18.7 33.6l-4.4-18.4L42.4 8.6 23.9 39.7z"></path>
                                        </svg>
                                    </li>
                                </ul>
                                <span class="operation-save">
                                            <svg aria-label="Save" class="_8-yf5 " color="#262626" fill="#262626"
                                                 height="24" role="img" viewBox="0 0 48 48" width="24"><path
                                                    d="M43.5 48c-.4 0-.8-.2-1.1-.4L24 29 5.6 47.6c-.4.4-1.1.6-1.6.3-.6-.2-1-.8-1-1.4v-45C3 .7 3.7 0 4.5 0h39c.8 0 1.5.7 1.5 1.5v45c0 .6-.4 1.2-.9 1.4-.2.1-.4.1-.6.1zM24 26c.8 0 1.6.3 2.2.9l15.8 16V3H6v39.9l15.8-16c.6-.6 1.4-.9 2.2-.9z"></path></svg>
                                        </span>
                            </div>


                 <%-------------------------------------------------------------------------------------------------------%>

                            <div class="about-like">
                                <!-- --------human-like---------- -->
                                <div class="total-like">
                                    <div class="avatar-human">
                                        <img style="width: 20px; height: 20px;" src="./asset/img/ava.jpg" alt="">
                                    </div>
                                    <div class="about-human">
                                        about liked
                                        <span>
                                                    <a href=""> <b>thainguyenn__</b> </a>
                                                </span>
                                        and
                                        <a href="">
                                            <span> <b>100k</b> </span>
                                        </a>
                                        <b>others</b>
                                    </div>
                                </div>
                            </div>
                            <div class="about-comment">
                                <div class="status">
                                    <span><a href="">thainguyenn__</a></span>
                                    <span>
                                                sometimes u will never know the value of a moment until it becomes a memory...
                                                sometime u think u nearly got everything but it doesn't anything...
                                                <i class="ti-face-sad"></i>
                                                Although loved ones are the most precious things...but sometimes they make us suffer the most....
                                            </span>
                                </div>
                                <div class="view-cmt">
                                    <a href="">
                                        View 1 comment
                                    </a>
                                </div>
                            </div>
                            <div class="about-time">
                                <a href="">
                                    <time> 5 HOURS AGO</time>
                                </a>
                            </div>
                            <div class="about-input">
                                <div class="input-wrapper">
                                            <span class="ava-acc-cmt">
                                                <img src="./asset/img/ava.jpg" alt="" height="24" width="24">
                                            </span>
                                    <span class="icon-cmt isnone">
                                                <svg aria-label="Emoji" class="_8-yf5 " color="#262626" fill="#262626"
                                                     height="24" role="img" viewBox="0 0 48 48" width="24"><path
                                                        d="M24 48C10.8 48 0 37.2 0 24S10.8 0 24 0s24 10.8 24 24-10.8 24-24 24zm0-45C12.4 3 3 12.4 3 24s9.4 21 21 21 21-9.4 21-21S35.6 3 24 3z"></path><path
                                                        d="M34.9 24c0-1.4-1.1-2.5-2.5-2.5s-2.5 1.1-2.5 2.5 1.1 2.5 2.5 2.5 2.5-1.1 2.5-2.5zm-21.8 0c0-1.4 1.1-2.5 2.5-2.5s2.5 1.1 2.5 2.5-1.1 2.5-2.5 2.5-2.5-1.1-2.5-2.5zM24 37.3c-5.2 0-8-3.5-8.2-3.7-.5-.6-.4-1.6.2-2.1.6-.5 1.6-.4 2.1.2.1.1 2.1 2.5 5.8 2.5 3.7 0 5.8-2.5 5.8-2.5.5-.6 1.5-.7 2.1-.2.6.5.7 1.5.2 2.1 0 .2-2.8 3.7-8 3.7z"></path>
                                                </svg>
                                            </span>
                                    <div class="input-add">
                                        <input type="text" placeholder="Add a comment...">
                                        <button class="btn">post</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </section>
                <section class="content-main__wrapper">
                    <div class="content-main__inner">
                        <div class="content-main__heading">
                            <header class="heading-inner">
                                <div class="heading-inner__ava">
                                    <img src="./asset/img/ava.jpg" alt="" class="heading-inner__ava-img">
                                </div>
                                <div>thainguyenn__</div>
                            </header>
                            <div class="heading-icon">
                                        <span class="heading-icon__inner">
                                            <svg aria-label="More options" class="_8-yf5 " color="#262626"
                                                 fill="#262626" height="24" role="img" viewBox="0 0 24 24" width="24"><circle
                                                    cx="12" cy="12" r="1.5"></circle><circle cx="6.5" cy="12"
                                                                                             r="1.5"></circle><circle
                                                    cx="17.5" cy="12" r="1.5"></circle>
                                            </svg>
                                        </span>
                            </div>
                        </div>
                        <div class="content-main__content">
                            <div class="content-main__content-img">
                                <iframe width="560" height="315"
                                        src="https://www.youtube-nocookie.com/embed/bGwF0sOwDr0"
                                        title="YouTube video player" frameborder="0"
                                        allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture"
                                        allowfullscreen></iframe>
                            </div>
                        </div>
                        <div class="content-main__about">
                            <div class="abut-operation">
                                <ul class="operation-list">
                                    <li class="operation-item operation-item-js">
                                        <svg aria-label="Like" class="_8-yf5 unlike " color="#262626" fill="#262626"
                                             height="24" role="img" viewBox="0 0 48 48" width="24">
                                            <path d="M34.6 6.1c5.7 0 10.4 5.2 10.4 11.5 0 6.8-5.9 11-11.5 16S25 41.3 24 41.9c-1.1-.7-4.7-4-9.5-8.3-5.7-5-11.5-9.2-11.5-16C3 11.3 7.7 6.1 13.4 6.1c4.2 0 6.5 2 8.1 4.3 1.9 2.6 2.2 3.9 2.5 3.9.3 0 .6-1.3 2.5-3.9 1.6-2.3 3.9-4.3 8.1-4.3m0-3c-4.5 0-7.9 1.8-10.6 5.6-2.7-3.7-6.1-5.5-10.6-5.5C6 3.1 0 9.6 0 17.6c0 7.3 5.4 12 10.6 16.5.6.5 1.3 1.1 1.9 1.7l2.3 2c4.4 3.9 6.6 5.9 7.6 6.5.5.3 1.1.5 1.6.5.6 0 1.1-.2 1.6-.5 1-.6 2.8-2.2 7.8-6.8l2-1.8c.7-.6 1.3-1.2 2-1.7C42.7 29.6 48 25 48 17.6c0-8-6-14.5-13.4-14.5z"></path>
                                        </svg>
                                        <svg aria-label="Unlike" class="_8-yf5 like " color="#ed4956" fill="#ed4956"
                                             height="24" role="img" viewBox="0 0 48 48" width="24">
                                            <path d="M34.6 3.1c-4.5 0-7.9 1.8-10.6 5.6-2.7-3.7-6.1-5.5-10.6-5.5C6 3.1 0 9.6 0 17.6c0 7.3 5.4 12 10.6 16.5.6.5 1.3 1.1 1.9 1.7l2.3 2c4.4 3.9 6.6 5.9 7.6 6.5.5.3 1.1.5 1.6.5s1.1-.2 1.6-.5c1-.6 2.8-2.2 7.8-6.8l2-1.8c.7-.6 1.3-1.2 2-1.7C42.7 29.6 48 25 48 17.6c0-8-6-14.5-13.4-14.5z"></path>
                                        </svg>
                                    </li>
                                    <li class="operation-item ">
                                        <svg aria-label="Comment" class="_8-yf5 " color="#262626" fill="#262626"
                                             height="24" role="img" viewBox="0 0 48 48" width="24">
                                            <path clip-rule="evenodd"
                                                  d="M47.5 46.1l-2.8-11c1.8-3.3 2.8-7.1 2.8-11.1C47.5 11 37 .5 24 .5S.5 11 .5 24 11 47.5 24 47.5c4 0 7.8-1 11.1-2.8l11 2.8c.8.2 1.6-.6 1.4-1.4zm-3-22.1c0 4-1 7-2.6 10-.2.4-.3.9-.2 1.4l2.1 8.4-8.3-2.1c-.5-.1-1-.1-1.4.2-1.8 1-5.2 2.6-10 2.6-11.4 0-20.6-9.2-20.6-20.5S12.7 3.5 24 3.5 44.5 12.7 44.5 24z"
                                                  fill-rule="evenodd"></path>
                                        </svg>
                                    </li>
                                    <li class="operation-item">
                                        <svg aria-label="Share Post" class="_8-yf5 " color="#262626" fill="#262626"
                                             height="24" role="img" viewBox="0 0 48 48" width="24">
                                            <path d="M47.8 3.8c-.3-.5-.8-.8-1.3-.8h-45C.9 3.1.3 3.5.1 4S0 5.2.4 5.7l15.9 15.6 5.5 22.6c.1.6.6 1 1.2 1.1h.2c.5 0 1-.3 1.3-.7l23.2-39c.4-.4.4-1 .1-1.5zM5.2 6.1h35.5L18 18.7 5.2 6.1zm18.7 33.6l-4.4-18.4L42.4 8.6 23.9 39.7z"></path>
                                        </svg>
                                    </li>
                                </ul>
                                <span class="operation-save">
                                            <a href="">
                                                <svg aria-label="Save" class="_8-yf5 " color="#262626" fill="#262626"
                                                     height="24" role="img" viewBox="0 0 48 48" width="24"><path
                                                        d="M43.5 48c-.4 0-.8-.2-1.1-.4L24 29 5.6 47.6c-.4.4-1.1.6-1.6.3-.6-.2-1-.8-1-1.4v-45C3 .7 3.7 0 4.5 0h39c.8 0 1.5.7 1.5 1.5v45c0 .6-.4 1.2-.9 1.4-.2.1-.4.1-.6.1zM24 26c.8 0 1.6.3 2.2.9l15.8 16V3H6v39.9l15.8-16c.6-.6 1.4-.9 2.2-.9z"></path></svg>
                                            </a>
                                </span>
                            </div>
                            <div class="about-like">
                                <!-- <span> 68k Likes</span> -->
                                <!-- --------human-like---------- -->
                                <div class="total-like">
                                    <div class="avatar-human">
                                        <img style="width: 20px; height: 20px;" src="./asset/img/ava.jpg" alt="">
                                    </div>
                                    <div class="about-human">
                                        liked by
                                        <span>
                                                    <a href=""> <b>thainguyenn__</b> </a>
                                                </span>
                                        and
                                        <a href="">
                                            <span> <b>100k</b> </span>
                                        </a>
                                        <b>others</b>
                                    </div>
                                </div>
                            </div>
                            <div class="about-comment">
                                <div class="status">
                                    <span><a href="">thainguyenn__</a></span>
                                    <span>
                                                sometimes u will never know the value of a moment until it becomes a memory...
                                            </span>
                                </div>
                                <div class="view-cmt">
                                    <a href="">
                                        View 1 comment
                                    </a>
                                </div>
                            </div>
                            <div class="about-time">
                                <a href="">
                                    <time> 5 HOURS AGO</time>
                                </a>
                            </div>
                            <div class="about-input">
                                <div class="input-wrapper">
                                            <span class="ava-acc-cmt">
                                                <img src="./asset/img/ava.jpg" alt="" height="24" width="24">
                                            </span>
                                    <span class="icon-cmt isnone">
                                                <svg aria-label="Emoji" class="_8-yf5 " color="#262626" fill="#262626"
                                                     height="24" role="img" viewBox="0 0 48 48" width="24"><path
                                                        d="M24 48C10.8 48 0 37.2 0 24S10.8 0 24 0s24 10.8 24 24-10.8 24-24 24zm0-45C12.4 3 3 12.4 3 24s9.4 21 21 21 21-9.4 21-21S35.6 3 24 3z"></path><path
                                                        d="M34.9 24c0-1.4-1.1-2.5-2.5-2.5s-2.5 1.1-2.5 2.5 1.1 2.5 2.5 2.5 2.5-1.1 2.5-2.5zm-21.8 0c0-1.4 1.1-2.5 2.5-2.5s2.5 1.1 2.5 2.5-1.1 2.5-2.5 2.5-2.5-1.1-2.5-2.5zM24 37.3c-5.2 0-8-3.5-8.2-3.7-.5-.6-.4-1.6.2-2.1.6-.5 1.6-.4 2.1.2.1.1 2.1 2.5 5.8 2.5 3.7 0 5.8-2.5 5.8-2.5.5-.6 1.5-.7 2.1-.2.6.5.7 1.5.2 2.1 0 .2-2.8 3.7-8 3.7z"></path>
                                                </svg>
                                            </span>
                                    <div class="input-add">
                                        <input type="text" placeholder="Add a comment...">
                                        <button class="btn">post</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </section>

            </div>
            <div class="empty">
                <aside class="content-right">
                    <div class="content-right__wrapper">
                        <div class="content-right__account">
                            <a class="content-right__account-ava">
                                <img src="./asset/img/ava.jpg" alt="" class="content-right__account-img">
                            </a>
                            <div class="content-right__account-name">
                                <div class="content-right__name-acc">thainguyenn__</div>
                                <div class="content-right__name-real">Thái Nguyễn</div>
                            </div>
                            <button class="btn">Switch</button>
                        </div>
                        <div class="content-right__suggestions">
                            <div class="content-right__suggestions-heading">
                                <div class="content-right__suggestions-heading-L">Suggestions For You</div>
                                <div class="content-right__suggestions-heading-R">See All</div>
                            </div>
                            <div class="content-right__suggestions-wrapper">
                                <div class="content-right__suggestions-inner">
                                    <div class="content-right__suggestions-ava">
                                        <img class="content-right__suggestions-img" src="./asset/img/ava.jpg" alt="">
                                    </div>
                                    <div class="content-right__suggestions-name">
                                        <div class="content-right__suggestions-name__acc">thaine_</div>
                                        <div class="content-right__suggestions-about">Suggested for you</div>
                                    </div>
                                    <button class="btn">Follow</button>
                                </div>
                            </div>
                        </div>
                        <div class="content-right__footer">
                            <div class="content-right__footer-wrapper">
                                <ul class="content-right__footer-list">
                                    <li class="content-right__footer-item">
                                        <a href="">About</a>
                                    </li>
                                    <li class="content-right__footer-item">
                                        <a href="">Help</a>
                                    </li>
                                    <li class="content-right__footer-item">
                                        <a href="">Press</a>
                                    </li>
                                    <li class="content-right__footer-item">
                                        <a href="">API</a>
                                    </li>
                                    <li class="content-right__footer-item">
                                        <a href="">Jobs</a>
                                    </li>
                                    <li class="content-right__footer-item">
                                        <a href="">Privacy</a>
                                    </li>
                                    <li class="content-right__footer-item">
                                        <a href="">Terms</a>
                                    </li>
                                    <li class="content-right__footer-item">
                                        <a href="">Locations</a>
                                    </li>
                                    <li class="content-right__footer-item">
                                        <a href="">Top Accounts</a>
                                    </li>
                                    <li class="content-right__footer-item">
                                        <a href="">Hashtags</a>
                                    </li>
                                    <li class="content-right__footer-item">
                                        <a href="">Language</a>
                                    </li>
                                </ul>
                                <span class="content-right__footer-bottom">© 1999 Instagram from Meta</span>
                            </div>
                        </div>
                    </div>
                </aside>
            </div>
        </div>
    </div>
</div>


<script> /* thả tim */
const likes = document.querySelectorAll('.like')
const unlikes = document.querySelectorAll('.unlike')
const operationItems = document.querySelectorAll('.operation-item-js')

function likeIt () {
    for(const operationItem of operationItems ){
        operationItem.classList.remove('liked')}}
for(const like of likes) {
    like.addEventListener('click',likeIt)}

function unlikeIt () {
    for(const operationItem of operationItems )
        operationItem.classList.add('liked')}
for(const unlike of unlikes) {
    unlike.addEventListener('click',unlikeIt)}
</script>
</body>
</html>