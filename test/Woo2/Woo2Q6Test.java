package Woo2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Woo2Q6Test {

    @Test
    void test() {
        Woo2Q6 woo2Q6 = new Woo2Q6();
        String[][] forms = {{"email1@email.com", "로므니가비무사브송라그구우아릉히헹히"}, {"email2@email.com", "거니히붕머구랄흐서느고미넨우우레느으"},
                {"email3@email.com", "닝마힝후올아몰르흐누에넨모에게루누후"}, {"email4@email.com", "소루루호어누비오근라르궁나메누그네마"},
                {"email5@email.com", "방너부수소라앙마브에난르리로나네무호"}, {"email6@email.com", "마기앙밀우구니누누눙리헹릉므모후고히"},
                {"email7@email.com", "뭉눈머버모부리니누리그오하민에우구가"}, {"email8@email.com", "호버으우리머러러리헤레흐헤후무강노게"},
                {"email9@email.com", "그부방르승서로오손헤깅오으라로룬게오"}, {"email10@email.com", "니하서니소르버르리곤그으로고로응므마"},
                {"email11@email.com", "실러히누부허소너모엥노라레리아마고후"}, {"email12@email.com", "그모보서사를블나니믄마누레기닌눙룬에"},
                {"email13@email.com", "사낭어러고므러히홀우곤메게루미에항구"}, {"email14@email.com", "기리느루너반우가얼렌메미기하아노흐리"},
                {"email15@email.com", "숭소부리온호너니롤레미근후깅에리렌기"}, {"email16@email.com", "미리비버마하으서브니하에하노미니므누"},
                {"email17@email.com", "므로부눈븐아흐모구미루나가오흐느그기"}, {"email18@email.com", "노서머깅사닌마바거누누나느무메가고모"},
                {"email19@email.com", "이부부브고누미고루나으그기논한니민레"}, {"email20@email.com", "넌고성시손니으브느기리로으로가르농가"},
                {"email21@email.com", "브보노누어어노흐볼호엔무그넨간이마마"}, {"email22@email.com", "시모호미시히후눈러기아근그안루하레응"},
                {"email23@email.com", "라모모아허거서무허나간무리후구노안민"}, {"email24@email.com", "소르러힝승고우부니메로우호우히롱우리"},
                {"email25@email.com", "서넝부라바서노이브흐몽구메네미무랑그"}, {"email26@email.com", "이무히소시브루러브마기후라고엥라므마"},
                {"email27@email.com", "서고아허루후론가스헤하노르하호그그기"}, {"email28@email.com", "수아로보뭉그니으농에헤마니이가흐강호"},
                {"email29@email.com", "민브사히나러버붕시으므느리론니레에후"}, {"email30@email.com", "머거보아힐부수므후네에으기누낭이기르"},
                {"email31@email.com", "고므라모나넝후기러리그게강마무누누아"}, {"email32@email.com", "시울후르러무간인군은나훙아하미그누호"},
                {"email33@email.com", "롱흐농기부모아리우에나른으하네고헤나"}, {"email34@email.com", "가비라무하비호라보기고미힌르므우랑니"},
                {"email35@email.com", "마긴깅부라구부릉나미에이그는넹나메루"}, {"email36@email.com", "라우미루능기로사아린메링느미우운네후"},
                {"email37@email.com", "르비부라서서브헐로무에노라룬기라엥게"}, {"email38@email.com", "마리부르모가니이민미오루고가누이르후"},
                {"email39@email.com", "바몬느롱비누브머부난므호후헤랑고누로"}, {"email40@email.com", "시거시히발사후우멀가헤흐헤기기흔게무"},
                {"email41@email.com", "보넌으실러를어랄부무게그니마네노하에"}, {"email42@email.com", "무머그느서하수으붕모네모가게호레기마"},
                {"email43@email.com", "가부허솔스릴허니넌마누르아므구헤미훈"}, {"email44@email.com", "발릉버룬너미가비우흐그그네그에오니으"},
                {"email45@email.com", "고그시허엉므후하기나마룽모메루후구나"}, {"email46@email.com", "니모사불혼넌그살라루흐이은후네몽로하"},
                {"email47@email.com", "불이오머마훌루므언르느리기엔루노로에"}, {"email48@email.com", "오기무나솔하보이므힝깅하가히하메레라"},
                {"email49@email.com", "리모부허브르그기사모고그흥메루네오흐"}, {"email50@email.com", "오르몽허호모비논버라마렌아으헤마리아"},
                {"email51@email.com", "우믄고고후상마호브르므나메마오겡느잉"}, {"email52@email.com", "므릴헌하로수믕부누망가우으른우로고리"},
                {"email53@email.com", "오너마난서루가므숭마안힝하능니느고이"}, {"email54@email.com", "구후그어소누나서서로가로호렝에기룽그"},
                {"email55@email.com", "러루붕아보서너망기흐깅른모메이르우누"}, {"email56@email.com", "라간므어응온그마루리흐니레미니오히느"},
                {"email57@email.com", "사렁소벌올스벌버너르긍미느헤아기겡르"}, {"email58@email.com", "시나노가러골기느닌웅긍라호르느므에그"},
                {"email59@email.com", "흐후어론미혼스버웅랑멩라레하난렝헤나"}, {"email60@email.com", "싱스그구니수어어고리르루나훙닌로노아"},
                {"email61@email.com", "모고호러히러헝부니라이고룬라란니닝니"}, {"email62@email.com", "브그로후기미하서울무힌에누호히강나믄"},
                {"email63@email.com", "히히오라서문므소소니기훙히므호에구니"}, {"email64@email.com", "슬나호거니부후로무네구히나메무넨고흔"},
                {"email65@email.com", "너하므러흐닝서머느후몬고니에나리낭므"}, {"email66@email.com", "거로아그스우부거눌라네르이모뭉라흐힝"},
                {"email67@email.com", "하루모사모스공나란무오헤미메라기무게"}, {"email68@email.com", "모브히기룬호어마우구느네리네라넨히멘"},
                {"email69@email.com", "뭉아수수빌건수부바문깅호므헤흐네르호"}, {"email70@email.com", "머서한가고닌수바누구루호에롱고니라호"},
                {"email71@email.com", "사미니무허는흐버부노히히모로으무리구"}, {"email72@email.com", "러아라닝른부소너로르로므구게깅메후가"},
                {"email73@email.com", "문머블빈이으비머홍기로엥네히으느오미"}, {"email74@email.com", "소흐마니벙사그하시우헤리가무네그라오"},
                {"email75@email.com", "니보스우그브므라놀레가몬고그미훙고네"}, {"email76@email.com", "로우니스나라호닐바모이루노호호무니망"},
                {"email77@email.com", "르런어갈누너구어오미흔무고누노낭게에"}, {"email78@email.com", "마리후마스루강할루호후렌아흐흐기미나"},
                {"email79@email.com", "라미구마보바라보서구레호노후게넹호레"}, {"email80@email.com", "바르소므호머나라발잉후르니리고로루메"},
                {"email81@email.com", "수너우간너븡루구우미라인구에훙느르가"}, {"email82@email.com", "누루미머보수니무느기아하군에흐누흐무"},
                {"email83@email.com", "마오이미흐스그고순마흐이흐게그오우그"}, {"email84@email.com", "닝부소럴후롱이부구노로흐무게니곤누노"},
                {"email85@email.com", "말굴느훌리루머흐거무르능히으무모네루"}, {"email86@email.com", "곤노바롱상으느후블란오네히흐므미능헤"},
                {"email87@email.com", "히기흐흐란구비그므므르므누옹느미모후"}, {"email88@email.com", "버사루거로능궁허스에아고아므훈그노고"},
                {"email89@email.com", "노우허붕서모리그물무니르레르레가나레"}, {"email90@email.com", "롱올어가비가고스루라루간오후으항아네"},
                {"email91@email.com", "로아히우노사아흐마라니하미마아궁랑로"}, {"email92@email.com", "이고어마마수가모민호뭉므게고이라후고"},
                {"email93@email.com", "시아바구너웅므서바가니누뭉그농곤누므"}, {"email94@email.com", "눈시오므몰우가기란이아네모나므누고미"},
                {"email95@email.com", "수호스허옹흐헝구으메모게느오레하히온"}, {"email96@email.com", "미오호나노올러오론누누구헤르하헤게오"},
                {"email97@email.com", "후미라흔링잉기스그우론흐근가한히헨이"}, {"email98@email.com", "흐머히호닌루그비우흐기마훈고아에흐리"},
                {"email99@email.com", "렁허볼브흘몬바머부히흐헨르미노르기후"}};

        String[] answer = new String[]{"email1@email.com", "email10@email.com", "email11@email.com",
                "email12@email.com", "email13@email.com", "email14@email.com", "email15@email.com", "email16@email.com",
                "email17@email.com", "email18@email.com", "email19@email.com", "email2@email.com", "email20@email.com",
                "email21@email.com", "email22@email.com", "email23@email.com", "email24@email.com", "email25@email.com",
                "email26@email.com", "email27@email.com", "email28@email.com", "email29@email.com", "email3@email.com",
                "email30@email.com", "email31@email.com", "email32@email.com", "email33@email.com", "email34@email.com",
                "email35@email.com", "email36@email.com", "email37@email.com", "email38@email.com", "email39@email.com",
                "email4@email.com", "email40@email.com", "email41@email.com", "email42@email.com", "email43@email.com",
                "email44@email.com", "email45@email.com", "email46@email.com", "email47@email.com", "email48@email.com",
                "email49@email.com", "email5@email.com", "email50@email.com", "email51@email.com", "email52@email.com",
                "email53@email.com", "email54@email.com", "email55@email.com", "email56@email.com", "email58@email.com",
                "email59@email.com", "email6@email.com", "email60@email.com", "email61@email.com", "email62@email.com",
                "email63@email.com", "email64@email.com", "email65@email.com", "email66@email.com", "email67@email.com",
                "email68@email.com", "email69@email.com", "email7@email.com", "email70@email.com", "email71@email.com",
                "email72@email.com", "email73@email.com", "email74@email.com", "email75@email.com", "email76@email.com",
                "email77@email.com", "email78@email.com", "email79@email.com", "email8@email.com", "email80@email.com",
                "email81@email.com", "email82@email.com", "email83@email.com", "email84@email.com", "email85@email.com",
                "email86@email.com", "email87@email.com", "email88@email.com", "email89@email.com", "email9@email.com",
                "email90@email.com", "email91@email.com", "email92@email.com", "email93@email.com", "email94@email.com",
                "email95@email.com", "email96@email.com", "email97@email.com", "email98@email.com", "email99@email.com"};
        Assertions.assertArrayEquals(woo2Q6.solution(forms), answer);
        // System.out.println(Arrays.toString(woo2Q6.solution(forms)));
    }
}
