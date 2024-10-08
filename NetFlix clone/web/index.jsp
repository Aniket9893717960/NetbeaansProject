<%-- 
    Document   : index
    Created on : 8 Feb, 2024, 9:56:23 AM
    Author     : INDIA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Netflix India – Watch TV Shows Online, Watch Movies Online</title>
    <link rel="stylesheet" href="style.css">
</head>

<body>

    <div class="main">
        <nav>
            <span><img  src="assets/images/logo.svg" alt=""></span>
            <div>
                <button class="language-btn"><i class="bi bi-translate" style="background-color: white;"></i>English<img src="assets/images/down-icon.png"></button>
                <button class="btn btn-red-sm">Sign In</button>
            </div>
        </nav>
        <div class="box">
        </div>
        <div class="hero">
            <span>Enjoy big movies, hit series and more from ₹ 149.</span>
            <span>Join today. Cancel anytime.</span>
            <span>Ready to watch? Enter your email to create or restart your membership.</span>
            <form class="email-signup">
                <input type="email" placeholder="Email Address">
                <button class="btn btn-red">Get Started &gt;</button>
            </form>
        </div>

        <div class="separation"></div>

    </div>

    <section class="first">
        <div>
            <span>Enjoy on your TV</span>
            <span>Watch on smart TVs, PlayStation, Xbox, Chromecast, Apple TV, Blu-ray players and more.</span>
        </div>

        <div class="secImg">
            <img src="https://assets.nflxext.com/ffe/siteui/acquisition/ourStory/fuji/desktop/tv.png" alt="">
            <video src="https://assets.nflxext.com/ffe/siteui/acquisition/ourStory/fuji/desktop/video-tv-in-0819.m4v"
                autoplay loop muted></video>
        </div>
    </section>
    <div class="separation"></div>

    <section class="first second">

        <div class="secImg">
            <img src="https://assets.nflxext.com/ffe/siteui/acquisition/ourStory/fuji/desktop/mobile-0819.jpg" alt="">

        </div>
        <div>
            <span>Download your shows to watch offline</span>
            <span>Save your favourites easily and always have something to watch.</span>
        </div>
    </section>

    <div class="separation"></div>
    <section class="first third">
        <div>
            <span>Watch everywhere</span>
            <span>Stream unlimited movies and TV shows on your phone, tablet, laptop, and TV.</span>
        </div>

        <div class="secImg">
            <img src="https://assets.nflxext.com/ffe/siteui/acquisition/ourStory/fuji/desktop/tv.png" alt="">
            <video src="https://assets.nflxext.com/ffe/siteui/acquisition/ourStory/fuji/desktop/video-devices-in.m4v"
                autoplay loop muted></video>
        </div>
    </section>
    <div class="separation"></div>


    <section class="first second">

        <div class="secImg">
            <img src="https://occ-0-2849-3646.1.nflxso.net/dnm/api/v6/19OhWN2dO19C9txTON9tvTFtefw/AAAABVr8nYuAg0xDpXDv0VI9HUoH7r2aGp4TKRCsKNQrMwxzTtr-NlwOHeS8bCI2oeZddmu3nMYr3j9MjYhHyjBASb1FaOGYZNYvPBCL.png?r=54d"
                alt="">

        </div>
        <div>
            <span>Create profiles for kids</span>
            <span>Send children on adventures with their favourite characters in a space made just for them—free with
                your membership.</span>
        </div>
    </section>

    <div class="separation"></div>

    <section class="faq">
        <h2>Frequently Asked Questions</h2>
            <input type="radio" name="radio" id="first" style="display:none;">
        <div class="faqbox">
            <span>What is NetFlix</span>
            <svg width="24" height="24" viewBox="0 0 24 24" fill="white" xmlns="http://www.w3.org/2000/svg">
                <path d="M12 4V20" stroke="#141B34" stroke-width="1.5" stroke-linecap="round" stroke-linejoin="round" />
                <path d="M4 12H20" stroke="#141B34" stroke-width="1.5" stroke-linecap="round" stroke-linejoin="round" />
            </svg>
        </div>
        <div class="content" style="background:#303030;text-align: left;padding:0 20px;max-height: 0;overflow:hidden;">
            <p>Netflix is a streaming service that offers a wide variety of award-winning TV shows, movies,
                anime, documentaries and more – on thousands of internet-connected devices.
You can watch as much as you want, whenever you want, without a single ad – all
for one low monthly price. There's always something new to discover, and new TV shows and movies are added every week!</p>
            </div>
        <input type="radio" name="faq" id="second" style="display:none;">
        <div class="faqbox">
            <span>How much does Netflix cost?</span>
            <svg width="24" height="24" viewBox="0 0 24 24" fill="white" xmlns="http://www.w3.org/2000/svg">
                <path d="M12 4V20" stroke="#141B34" stroke-width="1.5" stroke-linecap="round" stroke-linejoin="round" />
                <path d="M4 12H20" stroke="#141B34" stroke-width="1.5" stroke-linecap="round" stroke-linejoin="round" />
            </svg>
        </div>
        <div class="content" style="background:#303030;text-align: left;padding:0 20px;max-height: 0;overflow:hidden;">
            <p>Watch Netflix on your smartphone, tablet, Smart TV, laptop,
                or streaming device, all for one fixed monthly fee.
                Plans range from ₹649 to ₹149 a month. No extra costs, no contracts.</p>
        </div>
        <input type="radio" name="faq" id="third" style="display:none;">
        <div class="faqbox">
            <span>Where can i watch?</span>
            <svg width="24" height="24" viewBox="0 0 24 24" fill="white" xmlns="http://www.w3.org/2000/svg">
                <path d="M12 4V20" stroke="#141B34" stroke-width="1.5" stroke-linecap="round" stroke-linejoin="round" />
                <path d="M4 12H20" stroke="#141B34" stroke-width="1.5" stroke-linecap="round" stroke-linejoin="round" />
            </svg>
        </div>
        <div class="content" style="background:#303030;text-align: left;padding:0 20px;max-height: 0;overflow:hidden;">
            <p>Watch anywhere, anytime. Sign in with your Netflix account to watch instantly 
                on the web at netflix.com from your personal computer or on any internet-connected
               device that offers the Netflix app, including smart TVs, smartphones, tablets, streaming media players and game consoles.

You can also download your favourite shows with the iOS, Android, or Windows 10 app. 
Use downloads to watch while you're on the go and without an internet connection. Take Netflix with you anywhere.</p>
            </div>
        <input type="radio" name="faq" id="fourth" style="display:none;">
        <div class="faqbox">
            <span>How do I cancel?</span>
            <svg width="24" height="24" viewBox="0 0 24 24" fill="white" xmlns="http://www.w3.org/2000/svg">
                <path d="M12 4V20" stroke="#141B34" stroke-width="1.5" stroke-linecap="round" stroke-linejoin="round" />
                <path d="M4 12H20" stroke="#141B34" stroke-width="1.5" stroke-linecap="round" stroke-linejoin="round" />
            </svg>
        </div>
        <div class="content" style="background:#303030;text-align: left;padding:0 20px;max-height: 0;overflow:hidden;">
            <p>Netflix is flexible. There are no annoying contracts and no commitments. 
                You can easily cancel your account online in two clicks. There are no cancellation fees – start or stop your account anytime.</p>
            </div>
        <input type="radio" name="faq" id="fifth" style="display:none;">
        <div class="faqbox">
            <span>What can I watch on Netflix?</span>
            <svg width="24" height="24" viewBox="0 0 24 24" fill="white" xmlns="http://www.w3.org/2000/svg">
                <path d="M12 4V20" stroke="#141B34" stroke-width="1.5" stroke-linecap="round" stroke-linejoin="round" />
                <path d="M4 12H20" stroke="#141B34" stroke-width="1.5" stroke-linecap="round" stroke-linejoin="round" />
            </svg>
        </div>
        <div class="content" style="background:#303030;text-align: left;padding:0 20px;max-height: 0;overflow:hidden;">
            <p>Netflix has an extensive library of feature films,
                documentaries, TV shows, anime, award-winning Netflix originals, and more. 
                Watch as much as you want, anytime you want.</p>
            </div>
        <input type="radio" name="faq" id="sixth" style="display:none;">
        <div class="faqbox">
            <span>Is it good for Kids?</span>
            <svg width="24" height="24" viewBox="0 0 24 24" fill="white" xmlns="http://www.w3.org/2000/svg">
                <path d="M12 4V20" stroke="#141B34" stroke-width="1.5" stroke-linecap="round" stroke-linejoin="round" />
                <path d="M4 12H20" stroke="#141B34" stroke-width="1.5" stroke-linecap="round" stroke-linejoin="round" />
            </svg>
        </div>
        <div class="content" style="background:#303030;text-align: left;padding:0 20px;max-height: 0;overflow:hidden;">
        <p>The Netflix Kids experience is included
                in your membership to give parents control while kids enjoy family-friendly TV shows and films in their own space.
Kids profiles come with PIN-protected parental controls that let you restrict the maturity rating of content
kids can watch and block specific titles you don’t want kids to see.</p>
        </div>
        <p style="text-align: center;">Ready to watch? Enter your email to create or restart your membership.</p>
         <div class="hero">
            <form class="email-signup">
                <input style="color:white; background:black;border-color: white;"type="email" placeholder="Email Address">
                <button class="btn btn-red">Get Started &gt;</button>
            </form>
        </div>
    </section>
    <div class="separation"></div>

    <footer>
        <div class="questions">
            Questions? Call 000-800-919-1694
        </div>
        <div class="footer">
            <div class="footer-item"> 
                <a href="faq">Investor Relations</a>
                <a href="faq">Jobs</a>
                <a href="faq">Ways to Watch</a>
                <a href="faq">Terms of Use</a>
            </div>

            <div class="footer-item"> 
                <a href="faq">Help Centre</a>
                <a href="faq">Account</a>
                <a href="faq">Speed Test</a>
                <a href="faq">Legal Notices</a>
            </div>
            <div class="footer-item">
                <a href="faq">Media Centre</a>
                <a href="faq">Privacy</a>
                <a href="faq">Cookie Preferences</a> 
                <a href="faq">Corporate</a>
            </div>

            <div class="footer-item">
                <a href="faq">Contact Us</a>
                <a href="faq">Speed Test</a> 
                <a href="faq">Legal Notices</a> 
                <a href="faq">Only on Netflix</a>
            </div>
        </div>
    </footer>
    
</body>
</html>