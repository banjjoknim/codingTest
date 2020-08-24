package w2Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import w2.Woo6;

class Woo6Test {

    @Test
    void woo6Test() {
        String[] answer = {};

        String testCase = "[[\"email1@email.com\", \"가롤러\"], [\"email2@email.com\", \"소후누\"], [\"email3@email.com\", \"렁부바\"], [\"email4@email.com\", \"얼릴소\"], [\"email5@email.com\", \"넝오후\"], [\"email6@email.com\", \"리날보\"], [\"email7@email.com\", \"브말온\"], [\"email8@email.com\", \"후루강\"], [\"email9@email.com\", \"모후누\"], [\"email10@email.com\", \"이라수\"], [\"email11@email.com\", \"민노아\"], [\"email12@email.com\", \"우헌흐\"], [\"email13@email.com\", \"허흐기\"], [\"email14@email.com\", \"수사느\"], [\"email15@email.com\", \"마히으\"], [\"email16@email.com\", \"호고무\"], [\"email17@email.com\", \"스무허\"], [\"email18@email.com\", \"보헌어\"], [\"email19@email.com\", \"무나허\"], [\"email20@email.com\", \"므어버\"], [\"email21@email.com\", \"어어나\"], [\"email22@email.com\", \"뭉눈고\"], [\"email23@email.com\", \"그바버\"], [\"email24@email.com\", \"가구노\"], [\"email25@email.com\", \"허른러\"], [\"email26@email.com\", \"걸우니\"], [\"email27@email.com\", \"부리븡\"], [\"email28@email.com\", \"오스고\"], [\"email29@email.com\", \"리그버\"], [\"email30@email.com\", \"미소그\"], [\"email31@email.com\", \"루븡버\"], [\"email32@email.com\", \"스승를\"], [\"email33@email.com\", \"히후아\"], [\"email34@email.com\", \"우거구\"], [\"email35@email.com\", \"훙아은\"], [\"email36@email.com\", \"미마슬\"], [\"email37@email.com\", \"민훙무\"], [\"email38@email.com\", \"가하러\"], [\"email39@email.com\", \"바니누\"], [\"email40@email.com\", \"미이거\"], [\"email41@email.com\", \"느러모\"], [\"email42@email.com\", \"무히버\"], [\"email43@email.com\", \"루아모\"], [\"email44@email.com\", \"오느미\"], [\"email45@email.com\", \"나번리\"], [\"email46@email.com\", \"가시선\"], [\"email47@email.com\", \"나머고\"], [\"email48@email.com\", \"시으미\"], [\"email49@email.com\", \"할을이\"], [\"email50@email.com\", \"우으바\"], [\"email51@email.com\", \"후룬노\"], [\"email52@email.com\", \"르니너\"], [\"email53@email.com\", \"브흐홍\"], [\"email54@email.com\", \"런사우\"], [\"email55@email.com\", \"르늘라\"], [\"email56@email.com\", \"울비소\"], [\"email57@email.com\", \"이므간\"], [\"email58@email.com\", \"수모로\"], [\"email59@email.com\", \"구후마\"], [\"email60@email.com\", \"근니므\"], [\"email61@email.com\", \"미로흐\"], [\"email62@email.com\", \"어니그\"], [\"email63@email.com\", \"랑하븐\"], [\"email64@email.com\", \"머런히\"], [\"email65@email.com\", \"부믕오\"], [\"email66@email.com\", \"훈흘소\"], [\"email67@email.com\", \"허아거\"], [\"email68@email.com\", \"브수루\"], [\"email69@email.com\", \"링흐기\"], [\"email70@email.com\", \"아겅보\"], [\"email71@email.com\", \"나노바\"], [\"email72@email.com\", \"라고허\"], [\"email73@email.com\", \"라너루\"], [\"email74@email.com\", \"미누사\"], [\"email75@email.com\", \"무라깅\"], [\"email76@email.com\", \"붕마우\"], [\"email77@email.com\", \"오흐알\"], [\"email78@email.com\", \"흘릴으\"], [\"email79@email.com\", \"너사기\"], [\"email80@email.com\", \"허허누\"], [\"email81@email.com\", \"시이으\"], [\"email82@email.com\", \"부어느\"], [\"email83@email.com\", \"브으아\"], [\"email84@email.com\", \"어선훈\"], [\"email85@email.com\", \"스니리\"], [\"email86@email.com\", \"후느기\"], [\"email87@email.com\", \"마마라\"], [\"email88@email.com\", \"모히스\"], [\"email89@email.com\", \"븡오하\"], [\"email90@email.com\", \"모느훙\"], [\"email91@email.com\", \"얼허머\"], [\"email92@email.com\", \"승허므\"], [\"email93@email.com\", \"바모라\"], [\"email94@email.com\", \"아운노\"], [\"email95@email.com\", \"비나근\"], [\"email96@email.com\", \"버그흐\"], [\"email97@email.com\", \"리라허\"], [\"email98@email.com\", \"르리너\"], [\"email99@email.com\", \"로가우\"], [\"email100@email.com\", \"모늘미노\"], [\"email101@email.com\", \"미수히기\"], [\"email102@email.com\", \"할비바날\"], [\"email103@email.com\", \"거고구흐\"], [\"email104@email.com\", \"간누머루\"], [\"email105@email.com\", \"구무미노\"], [\"email106@email.com\", \"오러니그\"], [\"email107@email.com\", \"바바모모\"], [\"email108@email.com\", \"라서나비\"], [\"email109@email.com\", \"르허그거\"], [\"email110@email.com\", \"으무나웅\"], [\"email111@email.com\", \"수사닌골\"], [\"email112@email.com\", \"로넌노버\"], [\"email113@email.com\", \"스구사흐\"], [\"email114@email.com\", \"울른가구\"], [\"email115@email.com\", \"나호마호\"], [\"email116@email.com\", \"우그사스\"], [\"email117@email.com\", \"훈근노수\"], [\"email118@email.com\", \"가민사누\"], [\"email119@email.com\", \"히으우아\"], [\"email120@email.com\", \"브로훈무\"], [\"email121@email.com\", \"무브후소\"], [\"email122@email.com\", \"룽호흐그\"], [\"email123@email.com\", \"닝언호산\"], [\"email124@email.com\", \"기리슬버\"], [\"email125@email.com\", \"안븐보그\"], [\"email126@email.com\", \"니르히가\"], [\"email127@email.com\", \"바긴허아\"], [\"email128@email.com\", \"힌우느헐\"], [\"email129@email.com\", \"느가르마\"], [\"email130@email.com\", \"날빌비빙\"], [\"email131@email.com\", \"어러송서\"], [\"email132@email.com\", \"잉루흐고\"], [\"email133@email.com\", \"어고므무\"], [\"email134@email.com\", \"미번빙어\"], [\"email135@email.com\", \"므나머오\"], [\"email136@email.com\", \"가머비소\"], [\"email137@email.com\", \"넝닌린로\"], [\"email138@email.com\", \"어누히서\"], [\"email139@email.com\", \"우언너비\"], [\"email140@email.com\", \"느무가라\"], [\"email141@email.com\", \"소그흐사\"], [\"email142@email.com\", \"리므너망\"], [\"email143@email.com\", \"사리신로\"], [\"email144@email.com\", \"므시스소\"], [\"email145@email.com\", \"너강니바\"], [\"email146@email.com\", \"나라허노\"], [\"email147@email.com\", \"보루하수\"], [\"email148@email.com\", \"보길산로\"], [\"email149@email.com\", \"브밀군머\"], [\"email150@email.com\", \"우아스노\"], [\"email151@email.com\", \"날아브반\"], [\"email152@email.com\", \"눌시른고\"], [\"email153@email.com\", \"고으모린\"], [\"email154@email.com\", \"이고곤시\"], [\"email155@email.com\", \"구바아보\"], [\"email156@email.com\", \"서허항무\"], [\"email157@email.com\", \"룽홀건비\"], [\"email158@email.com\", \"호후아버\"], [\"email159@email.com\", \"나라믕무\"], [\"email160@email.com\", \"사구스그\"], [\"email161@email.com\", \"부우호안\"], [\"email162@email.com\", \"호호볼마\"], [\"email163@email.com\", \"구버비니\"], [\"email164@email.com\", \"롤는로건\"], [\"email165@email.com\", \"아노헐빌\"], [\"email166@email.com\", \"소르부리\"], [\"email167@email.com\", \"히머거므\"], [\"email168@email.com\", \"오부너부\"], [\"email169@email.com\", \"헝설버구\"], [\"email170@email.com\", \"그모시너\"], [\"email171@email.com\", \"소흐버허\"], [\"email172@email.com\", \"허우브므\"], [\"email173@email.com\", \"렁라고서\"], [\"email174@email.com\", \"보길란허\"], [\"email175@email.com\", \"미룽버우\"], [\"email176@email.com\", \"으버보무\"], [\"email177@email.com\", \"소느먼민\"], [\"email178@email.com\", \"누시반강\"], [\"email179@email.com\", \"시스브그\"], [\"email180@email.com\", \"눙거버리\"], [\"email181@email.com\", \"부고븡버\"], [\"email182@email.com\", \"기보브누\"], [\"email183@email.com\", \"서훌브히\"], [\"email184@email.com\", \"라오라븐\"], [\"email185@email.com\", \"러바슬므\"], [\"email186@email.com\", \"하가브흐\"], [\"email187@email.com\", \"이후허버\"], [\"email188@email.com\", \"기고마몰\"], [\"email189@email.com\", \"비호상르\"], [\"email190@email.com\", \"놀누미마\"], [\"email191@email.com\", \"가보몬붕\"], [\"email192@email.com\", \"으흐브으\"], [\"email193@email.com\", \"모훙시구\"], [\"email194@email.com\", \"눈오느누\"], [\"email195@email.com\", \"구버길너\"], [\"email196@email.com\", \"브구그눌\"], [\"email197@email.com\", \"러오서후\"], [\"email198@email.com\", \"라수르오\"], [\"email199@email.com\", \"언어\"], [\"email200@email.com\", \"히거\"], [\"email201@email.com\", \"르우\"], [\"email202@email.com\", \"그소\"], [\"email203@email.com\", \"수소\"], [\"email204@email.com\", \"으고\"], [\"email205@email.com\", \"고서\"], [\"email206@email.com\", \"기부\"], [\"email207@email.com\", \"수그\"], [\"email208@email.com\", \"거모\"], [\"email209@email.com\", \"느운\"], [\"email210@email.com\", \"마니\"], [\"email211@email.com\", \"라늘\"], [\"email212@email.com\", \"미스\"], [\"email213@email.com\", \"소노\"], [\"email214@email.com\", \"바방\"], [\"email215@email.com\", \"기바\"], [\"email216@email.com\", \"머송\"], [\"email217@email.com\", \"마로\"], [\"email218@email.com\", \"허우\"], [\"email219@email.com\", \"아살\"], [\"email220@email.com\", \"니승\"], [\"email221@email.com\", \"근리\"], [\"email222@email.com\", \"우수\"], [\"email223@email.com\", \"러누\"], [\"email224@email.com\", \"버허\"], [\"email225@email.com\", \"비무\"], [\"email226@email.com\", \"므헐\"], [\"email227@email.com\", \"난널\"], [\"email228@email.com\", \"불거\"], [\"email229@email.com\", \"머나\"], [\"email230@email.com\", \"로호\"], [\"email231@email.com\", \"시수\"], [\"email232@email.com\", \"부구\"], [\"email233@email.com\", \"그버\"], [\"email234@email.com\", \"호그\"], [\"email235@email.com\", \"무긍\"], [\"email236@email.com\", \"마니\"], [\"email237@email.com\", \"길므\"], [\"email238@email.com\", \"설아\"], [\"email239@email.com\", \"버구\"], [\"email240@email.com\", \"루누\"], [\"email241@email.com\", \"리무\"], [\"email242@email.com\", \"런놀\"], [\"email243@email.com\", \"성브\"], [\"email244@email.com\", \"나하\"], [\"email245@email.com\", \"미승\"], [\"email246@email.com\", \"으하\"], [\"email247@email.com\", \"루보\"], [\"email248@email.com\", \"브시\"], [\"email249@email.com\", \"리허\"], [\"email250@email.com\", \"누벌\"], [\"email251@email.com\", \"르르\"], [\"email252@email.com\", \"버고\"], [\"email253@email.com\", \"사훌\"], [\"email254@email.com\", \"가허\"], [\"email255@email.com\", \"수믄\"], [\"email256@email.com\", \"흐우\"], [\"email257@email.com\", \"그르\"], [\"email258@email.com\", \"기리\"], [\"email259@email.com\", \"러는\"], [\"email260@email.com\", \"란러\"], [\"email261@email.com\", \"신소\"], [\"email262@email.com\", \"겅이\"], [\"email263@email.com\", \"바너\"], [\"email264@email.com\", \"거히\"], [\"email265@email.com\", \"보흐\"], [\"email266@email.com\", \"노룽\"], [\"email267@email.com\", \"누므\"], [\"email268@email.com\", \"몰스\"], [\"email269@email.com\", \"승수\"], [\"email270@email.com\", \"이너\"], [\"email271@email.com\", \"노어\"], [\"email272@email.com\", \"부구\"], [\"email273@email.com\", \"머서\"], [\"email274@email.com\", \"바그\"], [\"email275@email.com\", \"흐소\"], [\"email276@email.com\", \"구브\"], [\"email277@email.com\", \"흐흐\"], [\"email278@email.com\", \"므누\"], [\"email279@email.com\", \"고싱\"], [\"email280@email.com\", \"바멍\"], [\"email281@email.com\", \"브느\"], [\"email282@email.com\", \"아스\"], [\"email283@email.com\", \"버브\"], [\"email284@email.com\", \"리니\"], [\"email285@email.com\", \"허으\"], [\"email286@email.com\", \"사아\"], [\"email287@email.com\", \"미로\"], [\"email288@email.com\", \"라말\"], [\"email289@email.com\", \"느훙\"], [\"email290@email.com\", \"보리\"], [\"email291@email.com\", \"브르\"], [\"email292@email.com\", \"러누\"], [\"email293@email.com\", \"룽바\"], [\"email294@email.com\", \"바선\"], [\"email295@email.com\", \"옹너\"], [\"email296@email.com\", \"우웅\"]]";
        String convertTestCase = testCase.replaceAll("\\[", "{").replaceAll("\\]", "}");
        String testCaseAnswer = "[\"email10@email.com\", \"email100@email.com\", \"email105@email.com\", \"email106@email.com\", \"email107@email.com\", \"email110@email.com\", \"email111@email.com\", \"email114@email.com\", \"email119@email.com\", \"email124@email.com\", \"email127@email.com\", \"email13@email.com\", \"email135@email.com\", \"email136@email.com\", \"email14@email.com\", \"email141@email.com\", \"email144@email.com\", \"email146@email.com\", \"email148@email.com\", \"email15@email.com\", \"email150@email.com\", \"email158@email.com\", \"email159@email.com\", \"email163@email.com\", \"email166@email.com\", \"email169@email.com\", \"email171@email.com\", \"email172@email.com\", \"email173@email.com\", \"email174@email.com\", \"email179@email.com\", \"email181@email.com\", \"email186@email.com\", \"email19@email.com\", \"email190@email.com\", \"email192@email.com\", \"email194@email.com\", \"email195@email.com\", \"email198@email.com\", \"email2@email.com\", \"email205@email.com\", \"email210@email.com\", \"email218@email.com\", \"email223@email.com\", \"email224@email.com\", \"email232@email.com\", \"email233@email.com\", \"email236@email.com\", \"email239@email.com\", \"email24@email.com\", \"email258@email.com\", \"email27@email.com\", \"email272@email.com\", \"email282@email.com\", \"email287@email.com\", \"email289@email.com\", \"email29@email.com\", \"email292@email.com\", \"email30@email.com\", \"email31@email.com\", \"email33@email.com\", \"email36@email.com\", \"email44@email.com\", \"email47@email.com\", \"email53@email.com\", \"email56@email.com\", \"email61@email.com\", \"email62@email.com\", \"email67@email.com\", \"email69@email.com\", \"email72@email.com\", \"email83@email.com\", \"email9@email.com\", \"email90@email.com\", \"email93@email.com\", \"email96@email.com\", \"email97@email.com\"]"
            .replaceAll("\\[", "{")
            .replaceAll("\\]", "}");

        Woo6 woo6 = new Woo6();
        String[][] forms = {{"email1@email.com", "가롤러"}, {"email2@email.com", "소후누"},
            {"email3@email.com", "렁부바"}, {"email4@email.com", "얼릴소"}, {"email5@email.com", "넝오후"},
            {"email6@email.com", "리날보"}, {"email7@email.com", "브말온"}, {"email8@email.com", "후루강"},
            {"email9@email.com", "모후누"}, {"email10@email.com", "이라수"}, {"email11@email.com", "민노아"},
            {"email12@email.com", "우헌흐"}, {"email13@email.com", "허흐기"}, {"email14@email.com", "수사느"},
            {"email15@email.com", "마히으"}, {"email16@email.com", "호고무"}, {"email17@email.com", "스무허"},
            {"email18@email.com", "보헌어"}, {"email19@email.com", "무나허"}, {"email20@email.com", "므어버"},
            {"email21@email.com", "어어나"}, {"email22@email.com", "뭉눈고"}, {"email23@email.com", "그바버"},
            {"email24@email.com", "가구노"}, {"email25@email.com", "허른러"}, {"email26@email.com", "걸우니"},
            {"email27@email.com", "부리븡"}, {"email28@email.com", "오스고"}, {"email29@email.com", "리그버"},
            {"email30@email.com", "미소그"}, {"email31@email.com", "루븡버"}, {"email32@email.com", "스승를"},
            {"email33@email.com", "히후아"}, {"email34@email.com", "우거구"}, {"email35@email.com", "훙아은"},
            {"email36@email.com", "미마슬"}, {"email37@email.com", "민훙무"}, {"email38@email.com", "가하러"},
            {"email39@email.com", "바니누"}, {"email40@email.com", "미이거"}, {"email41@email.com", "느러모"},
            {"email42@email.com", "무히버"}, {"email43@email.com", "루아모"}, {"email44@email.com", "오느미"},
            {"email45@email.com", "나번리"}, {"email46@email.com", "가시선"}, {"email47@email.com", "나머고"},
            {"email48@email.com", "시으미"}, {"email49@email.com", "할을이"}, {"email50@email.com", "우으바"},
            {"email51@email.com", "후룬노"}, {"email52@email.com", "르니너"}, {"email53@email.com", "브흐홍"},
            {"email54@email.com", "런사우"}, {"email55@email.com", "르늘라"}, {"email56@email.com", "울비소"},
            {"email57@email.com", "이므간"}, {"email58@email.com", "수모로"}, {"email59@email.com", "구후마"},
            {"email60@email.com", "근니므"}, {"email61@email.com", "미로흐"}, {"email62@email.com", "어니그"},
            {"email63@email.com", "랑하븐"}, {"email64@email.com", "머런히"}, {"email65@email.com", "부믕오"},
            {"email66@email.com", "훈흘소"}, {"email67@email.com", "허아거"}, {"email68@email.com", "브수루"},
            {"email69@email.com", "링흐기"}, {"email70@email.com", "아겅보"}, {"email71@email.com", "나노바"},
            {"email72@email.com", "라고허"}, {"email73@email.com", "라너루"}, {"email74@email.com", "미누사"},
            {"email75@email.com", "무라깅"}, {"email76@email.com", "붕마우"}, {"email77@email.com", "오흐알"},
            {"email78@email.com", "흘릴으"}, {"email79@email.com", "너사기"}, {"email80@email.com", "허허누"},
            {"email81@email.com", "시이으"}, {"email82@email.com", "부어느"}, {"email83@email.com", "브으아"},
            {"email84@email.com", "어선훈"}, {"email85@email.com", "스니리"}, {"email86@email.com", "후느기"},
            {"email87@email.com", "마마라"}, {"email88@email.com", "모히스"}, {"email89@email.com", "븡오하"},
            {"email90@email.com", "모느훙"}, {"email91@email.com", "얼허머"}, {"email92@email.com", "승허므"},
            {"email93@email.com", "바모라"}, {"email94@email.com", "아운노"}, {"email95@email.com", "비나근"},
            {"email96@email.com", "버그흐"}, {"email97@email.com", "리라허"}, {"email98@email.com", "르리너"},
            {"email99@email.com", "로가우"}, {"email100@email.com", "모늘미노"}, {"email101@email.com", "미수히기"},
            {"email102@email.com", "할비바날"}, {"email103@email.com", "거고구흐"}, {"email104@email.com", "간누머루"},
            {"email105@email.com", "구무미노"}, {"email106@email.com", "오러니그"}, {"email107@email.com", "바바모모"},
            {"email108@email.com", "라서나비"}, {"email109@email.com", "르허그거"}, {"email110@email.com", "으무나웅"},
            {"email111@email.com", "수사닌골"}, {"email112@email.com", "로넌노버"}, {"email113@email.com", "스구사흐"},
            {"email114@email.com", "울른가구"}, {"email115@email.com", "나호마호"}, {"email116@email.com", "우그사스"},
            {"email117@email.com", "훈근노수"}, {"email118@email.com", "가민사누"}, {"email119@email.com", "히으우아"},
            {"email120@email.com", "브로훈무"}, {"email121@email.com", "무브후소"}, {"email122@email.com", "룽호흐그"},
            {"email123@email.com", "닝언호산"}, {"email124@email.com", "기리슬버"}, {"email125@email.com", "안븐보그"},
            {"email126@email.com", "니르히가"}, {"email127@email.com", "바긴허아"}, {"email128@email.com", "힌우느헐"},
            {"email129@email.com", "느가르마"}, {"email130@email.com", "날빌비빙"}, {"email131@email.com", "어러송서"},
            {"email132@email.com", "잉루흐고"}, {"email133@email.com", "어고므무"}, {"email134@email.com", "미번빙어"},
            {"email135@email.com", "므나머오"}, {"email136@email.com", "가머비소"}, {"email137@email.com", "넝닌린로"},
            {"email138@email.com", "어누히서"}, {"email139@email.com", "우언너비"}, {"email140@email.com", "느무가라"},
            {"email141@email.com", "소그흐사"}, {"email142@email.com", "리므너망"}, {"email143@email.com", "사리신로"},
            {"email144@email.com", "므시스소"}, {"email145@email.com", "너강니바"}, {"email146@email.com", "나라허노"},
            {"email147@email.com", "보루하수"}, {"email148@email.com", "보길산로"}, {"email149@email.com", "브밀군머"},
            {"email150@email.com", "우아스노"}, {"email151@email.com", "날아브반"}, {"email152@email.com", "눌시른고"},
            {"email153@email.com", "고으모린"}, {"email154@email.com", "이고곤시"}, {"email155@email.com", "구바아보"},
            {"email156@email.com", "서허항무"}, {"email157@email.com", "룽홀건비"}, {"email158@email.com", "호후아버"},
            {"email159@email.com", "나라믕무"}, {"email160@email.com", "사구스그"}, {"email161@email.com", "부우호안"},
            {"email162@email.com", "호호볼마"}, {"email163@email.com", "구버비니"}, {"email164@email.com", "롤는로건"},
            {"email165@email.com", "아노헐빌"}, {"email166@email.com", "소르부리"}, {"email167@email.com", "히머거므"},
            {"email168@email.com", "오부너부"}, {"email169@email.com", "헝설버구"}, {"email170@email.com", "그모시너"},
            {"email171@email.com", "소흐버허"}, {"email172@email.com", "허우브므"}, {"email173@email.com", "렁라고서"},
            {"email174@email.com", "보길란허"}, {"email175@email.com", "미룽버우"}, {"email176@email.com", "으버보무"},
            {"email177@email.com", "소느먼민"}, {"email178@email.com", "누시반강"}, {"email179@email.com", "시스브그"},
            {"email180@email.com", "눙거버리"}, {"email181@email.com", "부고븡버"}, {"email182@email.com", "기보브누"},
            {"email183@email.com", "서훌브히"}, {"email184@email.com", "라오라븐"}, {"email185@email.com", "러바슬므"},
            {"email186@email.com", "하가브흐"}, {"email187@email.com", "이후허버"}, {"email188@email.com", "기고마몰"},
            {"email189@email.com", "비호상르"}, {"email190@email.com", "놀누미마"}, {"email191@email.com", "가보몬붕"},
            {"email192@email.com", "으흐브으"}, {"email193@email.com", "모훙시구"}, {"email194@email.com", "눈오느누"},
            {"email195@email.com", "구버길너"}, {"email196@email.com", "브구그눌"}, {"email197@email.com", "러오서후"},
            {"email198@email.com", "라수르오"}, {"email199@email.com", "언어"}, {"email200@email.com", "히거"},
            {"email201@email.com", "르우"}, {"email202@email.com", "그소"}, {"email203@email.com", "수소"},
            {"email204@email.com", "으고"}, {"email205@email.com", "고서"}, {"email206@email.com", "기부"},
            {"email207@email.com", "수그"}, {"email208@email.com", "거모"}, {"email209@email.com", "느운"},
            {"email210@email.com", "마니"}, {"email211@email.com", "라늘"}, {"email212@email.com", "미스"},
            {"email213@email.com", "소노"}, {"email214@email.com", "바방"}, {"email215@email.com", "기바"},
            {"email216@email.com", "머송"}, {"email217@email.com", "마로"}, {"email218@email.com", "허우"},
            {"email219@email.com", "아살"}, {"email220@email.com", "니승"}, {"email221@email.com", "근리"},
            {"email222@email.com", "우수"}, {"email223@email.com", "러누"}, {"email224@email.com", "버허"},
            {"email225@email.com", "비무"}, {"email226@email.com", "므헐"}, {"email227@email.com", "난널"},
            {"email228@email.com", "불거"}, {"email229@email.com", "머나"}, {"email230@email.com", "로호"},
            {"email231@email.com", "시수"}, {"email232@email.com", "부구"}, {"email233@email.com", "그버"},
            {"email234@email.com", "호그"}, {"email235@email.com", "무긍"}, {"email236@email.com", "마니"},
            {"email237@email.com", "길므"}, {"email238@email.com", "설아"}, {"email239@email.com", "버구"},
            {"email240@email.com", "루누"}, {"email241@email.com", "리무"}, {"email242@email.com", "런놀"},
            {"email243@email.com", "성브"}, {"email244@email.com", "나하"}, {"email245@email.com", "미승"},
            {"email246@email.com", "으하"}, {"email247@email.com", "루보"}, {"email248@email.com", "브시"},
            {"email249@email.com", "리허"}, {"email250@email.com", "누벌"}, {"email251@email.com", "르르"},
            {"email252@email.com", "버고"}, {"email253@email.com", "사훌"}, {"email254@email.com", "가허"},
            {"email255@email.com", "수믄"}, {"email256@email.com", "흐우"}, {"email257@email.com", "그르"},
            {"email258@email.com", "기리"}, {"email259@email.com", "러는"}, {"email260@email.com", "란러"},
            {"email261@email.com", "신소"}, {"email262@email.com", "겅이"}, {"email263@email.com", "바너"},
            {"email264@email.com", "거히"}, {"email265@email.com", "보흐"}, {"email266@email.com", "노룽"},
            {"email267@email.com", "누므"}, {"email268@email.com", "몰스"}, {"email269@email.com", "승수"},
            {"email270@email.com", "이너"}, {"email271@email.com", "노어"}, {"email272@email.com", "부구"},
            {"email273@email.com", "머서"}, {"email274@email.com", "바그"}, {"email275@email.com", "흐소"},
            {"email276@email.com", "구브"}, {"email277@email.com", "흐흐"}, {"email278@email.com", "므누"},
            {"email279@email.com", "고싱"}, {"email280@email.com", "바멍"}, {"email281@email.com", "브느"},
            {"email282@email.com", "아스"}, {"email283@email.com", "버브"}, {"email284@email.com", "리니"},
            {"email285@email.com", "허으"}, {"email286@email.com", "사아"}, {"email287@email.com", "미로"},
            {"email288@email.com", "라말"}, {"email289@email.com", "느훙"}, {"email290@email.com", "보리"},
            {"email291@email.com", "브르"}, {"email292@email.com", "러누"}, {"email293@email.com", "룽바"},
            {"email294@email.com", "바선"}, {"email295@email.com", "옹너"}, {"email296@email.com", "우웅"}};
        answer = new String[] {"email10@email.com", "email100@email.com", "email105@email.com", "email106@email.com",
            "email107@email.com", "email110@email.com", "email111@email.com", "email114@email.com",
            "email119@email.com", "email124@email.com", "email127@email.com", "email13@email.com", "email135@email.com",
            "email136@email.com", "email14@email.com", "email141@email.com", "email144@email.com", "email146@email.com",
            "email148@email.com", "email15@email.com", "email150@email.com", "email158@email.com", "email159@email.com",
            "email163@email.com", "email166@email.com", "email169@email.com", "email171@email.com",
            "email172@email.com", "email173@email.com", "email174@email.com", "email179@email.com",
            "email181@email.com", "email186@email.com", "email19@email.com", "email190@email.com", "email192@email.com",
            "email194@email.com", "email195@email.com", "email198@email.com", "email2@email.com", "email205@email.com",
            "email210@email.com", "email218@email.com", "email223@email.com", "email224@email.com",
            "email232@email.com", "email233@email.com", "email236@email.com", "email239@email.com", "email24@email.com",
            "email258@email.com", "email27@email.com", "email272@email.com", "email282@email.com", "email287@email.com",
            "email289@email.com", "email29@email.com", "email292@email.com", "email30@email.com", "email31@email.com",
            "email33@email.com", "email36@email.com", "email44@email.com", "email47@email.com", "email53@email.com",
            "email56@email.com", "email61@email.com", "email62@email.com", "email67@email.com", "email69@email.com",
            "email72@email.com", "email83@email.com", "email9@email.com", "email90@email.com", "email93@email.com",
            "email96@email.com", "email97@email.com"};
        System.out.println(testCaseAnswer);
        assertArrayEquals(woo6.solution(forms), answer);
    }

}
