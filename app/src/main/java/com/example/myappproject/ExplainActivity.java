package com.example.myappproject;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ExplainActivity extends AppCompatActivity {
    TextView textname;
    TextView textexplain;
    ImageView imageView;
    Button btn;
    MediaPlayer mediaPlayer;


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explain);
        textname = findViewById(R.id.textName);
        textexplain = findViewById(R.id.animal_explain);
        imageView = findViewById(R.id.animal_picture);
        btn = findViewById(R.id.btnSound);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String pos = intent.getStringExtra("pos");
        textname.setText(name);


        switch (pos){
            case "0":
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.gosmdochi));
                textexplain.setText("몸길이는 약 20cm 안팎으로 대형종이다. 체모가 변형되어서 생긴 가시가 몸에 돋혀 있으며, 전체적으로 억세며 가로줄 모양의 어두운 무늬가 있다. 천적과 맞닥뜨리면 네다리를 배 부위에 모아 공처럼 몸을 둥글게 하여, 등에 난 가시털로 자신을 방어한다. 귓바퀴가 짧고 주둥이가 뾰족하며 발톱이 잘 발달했다.");
                mediaPlayer = MediaPlayer.create(ExplainActivity.this, R.raw.gosm);

                break;


            case "1":
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.daramge));
                textexplain.setText("다람쥐는 소형 또는 중형 설치류를 포함하는 다람쥐과 동물 중 일부를 일컫는 말이다. 좁게는 한반도에 사는 다람쥐과 동물인 다람쥐(Tamias sibiricus) 한 종만을 지칭하는 경우도 있고, 넓게는 북아메리카, 유럽 등에 사는 청서속(Sciurus)과 하늘다람쥐속(Pteromys) 등을 포함해서 부르는 말이기도 한다. 하지만 한반도에 사는 청서류인 Sciurus vulgaris coreae는 청서 또는 청설모라고 불린다. 오스트레일리아·뉴질랜드·남극·마다가스카르섬·뉴기니를 제외한 전 세계에 널리 분포한다.");
                mediaPlayer = MediaPlayer.create(ExplainActivity.this, R.raw.daramge);

                break;

            case "2":
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.jumunimouse));
                textexplain.setText("어포섬라고도 한다. 학자에 따라 여러 가지로 분류하는데, 대개 약 80종이 북아메리카·중앙아메리카·남아메리카에 분포한다. 수상성(樹上性)·지상성·수생성이 있다. 몸의 털은 길고 빽빽하게 나 있다. 털빛깔은 검은색·갈색·흰색 등이며, 등쪽은 히끗히끗하게 얼룩져 있다.");
                mediaPlayer = MediaPlayer.create(ExplainActivity.this, R.raw.jumunige);

                break;

            case "3":
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.rabbit));
                textexplain.setText("토끼목 토끼과에 속하는 동물의 총칭으로 중치류(重齒類)라고도 한다. 아프리카·아메리카·아시아·유럽에 분포하며 종류가 많다. 일반적으로 토끼라고 하면 유럽굴토끼의 축용종(畜用種)인 집토끼를 가리킬 때가 많다. 귀가 길고 꼬리는 짧으며, 쥐목(설치류)과 달라서 위턱의 앞니가 2쌍이고, 아래턱을 양옆으로 움직여서 먹이를 먹는다. 종에 따라 크기는 매우 다양하며 작게는 1~1.5kg, 크게는 7~8kg에 달하기도 한다. 토끼류를 일반적으로 나누면 멧토끼류[野兎類]와 굴토끼류[穴兎類]로 크게 나눌 수 있다.");
                mediaPlayer = MediaPlayer.create(ExplainActivity.this, R.raw.rabbit);

                break;

            case "4":
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.snake));
                textexplain.setText("뱀은 뱀아목에 속하는 파충류의 총칭으로 다리가 퇴화한 것이 특징이다. 거의 대부분 전체 길이가 1~2m이지만 큰 것은 10m, 작은 것은 10cm인 것도 있다. 현재 456 속의 약 2,900종으로 남극과 아일랜드섬을 제외한 세계의 각 대륙에 널리 분포하며, 일부는 북극권 부근까지 서식하고 있다.");
                mediaPlayer = MediaPlayer.create(ExplainActivity.this, R.raw.snake);

                break;

            case "5":
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.turtle));
                textexplain.setText("거북(문화어: 거부기)은 거북목에 속하는 파충류의 총칭이다. 가장 큰 종류로는 길이 250㎝, 몸무게 800㎏에 달하는 것도 있다.");
                mediaPlayer = MediaPlayer.create(ExplainActivity.this, R.raw.turtle);

                break;

            case "6":
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.fox));
                textexplain.setText("약 37 종의 동물이 여우로 불리며, 그 중에서 여우속(Vulpes)에 속하는 것은 12 종이다. 가장 흔하고 널리 퍼진 종은 붉은여우(Vulpes vulpes)이지만, 다른 종들도 모든 대륙에 널리 분포한다.");
                mediaPlayer = MediaPlayer.create(ExplainActivity.this, R.raw.fox);

                break;

            case "7":
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.cat));
                textexplain.setText("고양이는 식육목 고양이과에 속하는 포유류 동물이다. 일반적으로 \"고양이\"라 함은 인간에게 길들여진 집고양이(house cat 또는 domestic cat)를 말한다. 들고양이(wild cat)는 약 10만 년에서 7만 년 전부터 존재했다. 2007년 기준으로 최근의 연구에 따르면 길들여진 고양이의 기원은 약 1만 년 전 근동지방에서 스스로 숲 속을 나와 사람들이 모여사는 마을에 대담하게 정착하여 길들여진 5마리 정도의 아프리카들고양이(Felis silvestris lybica)로 추측된다");
                mediaPlayer = MediaPlayer.create(ExplainActivity.this, R.raw.cat);

                break;

            case "8":
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.jumunimouse));
                textexplain.setText("남극과 뉴질랜드 이외의 세계 각 지방에 분포하고 있다. 쥐는 지금으로부터 약 3,600만 년 이전 에오세에 나타나서 가장 번성하고 있는 종류로 약 220속 1,800종이 있다. 따라서, 형태·구조·서식장소가 다양하다.");
                mediaPlayer = MediaPlayer.create(ExplainActivity.this, R.raw.mouse_normal);

                break;

            case "9":
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.dog));
                textexplain.setText("개는 이리·자칼(jackal) 등이 조상이라고 하는데, 이는 개와 교배하여 계대(繼代) 번식의 가능성이 있는 새끼를 낳을 수 있다는 것을 뜻한다. 즉 개에 이들의 혈액이 혼혈될 가능성이 있다는 것이다. 그러나 두개골이나 치아의 구조를 보면 개는 혼합된 것이 아니며, 또 그들 중의 어느 것에서 생긴 것이라고도 여겨지지 않는다. 아마도 개는 오스트레일리아에 야생하는 딩고(dingo)나 남아시아에 반야생상태로 서식하는 개와 흡사한, 절멸된 야생종에서 생긴 것으로 추측된다.");
                mediaPlayer = MediaPlayer.create(ExplainActivity.this, R.raw.dog);

                break;

            case "10":
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.cow));
                textexplain.setText("넓은 뜻의 소는 소과 중에서 산양류·면양류·영양류(羚羊類) 이외의 것을 가리키며, 가축인 소 이외에 물소류·들소·야크·가우르·가얄·밴팅 등을 포함한다. 몸은 건장하고 머리가 낮으며, 목 부분의 아랫면에는 많은 육수(肉垂)가 있고, 꼬리는 가늘고 길며 끝에 모총(毛叢)이 있다. 뿔은 암수 모두 있는데, 마디 모양의 융기가 없고 꼬이거나 사리를 트는 일이 없다. 이 중에서 물소류·야크·가얄·밴팅 등은 가축화되어 있다.");
                mediaPlayer = MediaPlayer.create(ExplainActivity.this, R.raw.cow);

                break;

            case "11":
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.pig));
                textexplain.setText("돼지속의 동물로, 고기를 이용할 목적으로 기른다. 영어로는 pig·hog·swine 등으로 쓰이고 수퇘지는 boar, 암퇘지는 sow로 표현한다. 한자어로는 저(猪)·시(豕)·돈(豚)·체·해(亥) 등으로 적고, 한국에서는 돝·도야지로도 불렀다. 돼지가 가축화된 시기는 동남아시아에서는 약 4800년 전, 유럽에서는 약 3500년 전이며, 한국에 개량종 돼지가 들어온 것은 1903년이다.");
                mediaPlayer = MediaPlayer.create(ExplainActivity.this, R.raw.pig);

                break;

            case "12":
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.lion_male));
                textexplain.setText("아시아의 호랑이와 함께 대형 고양이족 가운데 최대의 맹수로서 '백수(百獸)의 왕(王)'으로 불린다. 표범, 재규어, 호랑이와 근연속(Panthera)이다. 수컷 사자와 암컷 호랑이가 교배하여 태어난 종을 라이거(liger), 수컷 호랑이와 암컷 사자가 교배하여 태어난 종을 범사자[tigon], 수컷 표범과 암컷 사자가 교배한 것을 레오폰(leopon), 수컷 재규어와 암컷 사자가 교배시에는 재그라이온(jaglion)이라 한다.");
                mediaPlayer = MediaPlayer.create(ExplainActivity.this, R.raw.tiger_lion_lion);

                break;

            case "13":
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.lion_female));
                textexplain.setText("사자의 수컷은 암컷보다 훨씬 크고 몸무게는 종에 따라 다소 차이는 있지만 100∼250kg이다. 몸길이 165∼250cm, 꼬리길이 75∼100cm이다. 큰 것은 몸길이가 293cm 정도 되는 개체도 있다. 털빛깔은 일반적으로 황갈색 또는 회갈색으로 털은 짧다. 갈기와 더불어 사자의 두드러진 특징은 암수가 모두 꼬리 끝에 술 모양으로 된 흑갈색의 털송이가 있는 점이다. 눈동자는 둥글고 주둥이는 폭이 넓다. 귓바퀴는 둥글고 크며 뒷면에 검은 반점이 있다. 송곳니는 예리하고 무는 힘이 강하며, 어금니는 아래위가 잘 씹히도록 되어 있어 고기를 자르기에 적응되었고 발톱이 예리하다. 평소에는 발톱이 닳지 않게 넣고 있다. 발가락 수, 갈고리발톱의 생김새 등은 다른 고양이류와 동일하다.");
                mediaPlayer = MediaPlayer.create(ExplainActivity.this, R.raw.tiger_lion_lion);

                break;

            case "14":
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.sheep));
                textexplain.setText("양은 가축인 면양(O. aries)·무플런양(mouflon)·아르갈리양(argalii)·빅혼(bighorn)·우리알(urial)·아시아무플런(Asian mouflon)·달리빅혼(dallii bighorn)·시베리아빅혼(Siberean bighorn)·아메리카빅혼(Rockey mountain sheep) 등 야생의 양을 포함한다");
                mediaPlayer = MediaPlayer.create(ExplainActivity.this, R.raw.sheep);

                break;

            case "15":
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.duthege));
                textexplain.setText("몸길이는 9-11cm, 꼬리길이는 1.2-3.5cm이다. 몸은 원통 모양이고, 목이 뚜렷하지 않다. 몸의 털은 부드럽고 곧게 서며, 빛깔은 암갈색 또는 흑갈색이다. 머리와 몸 아랫면은 주황색인데 이것은 피선(皮腺)에서의 분비액에 의해 착색된 것이다. 주둥이는 길고 뾰족한데, 그 끝과 윗면이 밖으로 드러난다. 눈은 매우 작아서 살 속에 묻혀 있다. 이빨은 매우 예리하며 42개이다. 땅에 터널을 파고 생활하는 동물로서 후각과 청각이 매우 발달했다.");
                mediaPlayer = MediaPlayer.create(ExplainActivity.this, R.raw.duthege);

                break;

            case "16":
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.domabam));
                textexplain.setText("몸길이는 47㎜ 정도, 꼬리길이는 44㎜ 정도이다. 몸은 보통 누런 갈색이고, 콧구멍에서 시작하여 귓구멍 근처에서 좁아졌다가 다시 넓어져서 꼬리에 이르는 짙은 갈색 띠가 나 있으며, 이 띠의 위와 아래는 흰색이다. 머리는 작은 편이고 길이가 짧다. 귓구멍은 크고 앞가장자리 주위에 작은 비늘이 없다. 몸통 중앙부에는 28줄의 넓은 비늘이 덮여 있다. 꼬리는 원통모양이며 끝이 뾰족하다.");
                mediaPlayer = MediaPlayer.create(ExplainActivity.this, R.raw.domabam);

                break;

            case "17":
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.frog));
                textexplain.setText("개구리는 한자어로 와(蛙)라고 한다. 무당개구리·두꺼비·청개구리·맹꽁이·개구리 등의 각과가 이에 포함된다. 그 중에서도 몸체가 작고 다리가 긴 종류를 개구리라 하며, 또 예로부터 울음소리를 즐기기 위해 사육한 기생개구리도 개구리라 하였다.");
                mediaPlayer = MediaPlayer.create(ExplainActivity.this, R.raw.frog);

                break;

            case "18":
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.bandalgasmgom));
                textexplain.setText("아시아흑곰은 미얀마, 인도, 네팔, 일본, 러시아, 부탄, 타이, 대한민국, 말레이시아, 티베트, 이란, 아프가니스탄, 파키스탄, 중화민국 등의 산지에 분포하는 곰이다. 몸은 검은 색이며 가슴에 V 자 또는 초승달 모양으로 연한 색 털이 나 있다.남아시아와 동아시아의 산악과 숲 지역에서 산다.다 자란 몸길이는 130~190 cm 정도이다. 몸무게는 수컷이 110~150 kg, 암컷이 65~90 kg 가량 나간다. 수명은 25년 정도이다. 겨울에는 겨울잠을 잔다.반달가슴곰은 일본어를 번역한 말이다. 본래 단순히 곰이라고 불렀으며, 한반도 북부에 서식하는 불곰은 큰곰이라고 일컬었다. 후각과 청각이 매우 발달하여 이를 이용해 섭식생활을 하며 새끼는 평균 2마리 정도 낳는다.");
                mediaPlayer = MediaPlayer.create(ExplainActivity.this, R.raw.bandalgasmgom);

                break;

            case "19":
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.bear));
                textexplain.setText("곰은 식육목 곰과 이며 포유동물이다. 어린 개체는 능소니라 부른다. 꼬리가 짧고 후각과 청각이 발달했으며, 발가락이 다섯 개이다. 길고 빽빽한 털로 덮여 있으며, 커다란 몸에 강한 팔다리를 갖고 있다");
                mediaPlayer = MediaPlayer.create(ExplainActivity.this, R.raw.bear);

                break;

            case "20":
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.giraffe));
                textexplain.setText("기린(麒麟)은 기린과의 포유동물로서 기린속에 속하는 동물의 총칭이다. 가장 목이 긴 육상 동물이며 또한 가장 큰 반추 동물이기도 하다. 수컷은 키가 4.8m~5.5m이며 몸무게는 1700kg까지 나간다. 암컷은 보통 수컷보다 약간 작다. 몸 색깔은 대개 주황색이 도는 갈색, 적갈색 또는 검은색의 패치 모양의 얼룩이, 크림색이 도는 엷은 황색의 그물눈에 의해 구획되어 있다. 기린은 사슴 및 소와 생물학상 관계가 있으며, 기린과 오카피 단 두 속만으로 구성되는 기린과에 속한다.");
                mediaPlayer = MediaPlayer.create(ExplainActivity.this, R.raw.giraffe);

                break;

            case "21":
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.elephant));
                textexplain.setText("코끼리(Elephant, 象)는 장비목에서 유일하게 현존하는 과인 코끼리과를 구성하는 동물들의 총칭이다. 현재까지 확인된 현존하는 코끼리는 아프리카코끼리·아시아코끼리·둥근귀코끼리와 그 아종들이 있으며, 육상동물 중에서 가장 몸집이 크다. 열대 및 일부 온대 기후를 보이는 사하라 이남 아프리카·남아시아·동남아시아 등지에 걸쳐 서식한다.");
                mediaPlayer = MediaPlayer.create(ExplainActivity.this, R.raw.elephant);

                break;

            case "22":
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.noala));
                textexplain.setText("오스트레일리아에 서식하는 초식성 유대류이며, 몸길이 60-80cm, 몸무게 4-15kg이다. 꼬리는 거의 없고 코가 크다. 앞·뒷발에 모두 5개씩 발가락이 있는데, 앞발 제1·제2발가락은 다른 발가락과 서로 마주보며 나뭇가지를 잡는 데 적합하다. 암컷의 배에는 육아낭이 있는데, 뒤쪽으로 입구가 있으며 안에 두 개의 젖꼭지가 있다. 털은 양털처럼 빽빽이 나 있으며 윗면은 암회색, 아랫면은 회백색이고 특히 귀의 털이 길다. 맹장은 몸길이의 약 3배로 포유류 중에서 가장 길어 2.4m나 된다.");
                mediaPlayer = MediaPlayer.create(ExplainActivity.this, R.raw.noala);

                break;

            case "23":
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.kangol));
                textexplain.setText("캥거루(영어: kangaroo, 문화어: 캉가루)는 캥거루과의 대형 유대류를 말한다. 왈라비의 경우는 캥거루와 거의 비슷하게 생겼으나, 캥거루보다 조금 더 작다. 유럽인들의 이주 후 초원이 늘어나 개체수가 급증했다. 애버리진의 주요 단백질 섭취원이기도 했고, 현재 식용으로도 사용되고 있다. 오스트레일리아·뉴기니 섬·태즈메이니아 섬 및 일부 그 주변의 여러 섬에 분포한다. 캥거루는 오스트레일리아의 상징으로 호주의 화폐의 일부나 군복에 나타나기도 한다.");
                mediaPlayer = MediaPlayer.create(ExplainActivity.this, R.raw.kango);

                break;

            case "24":
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.hamster));
                textexplain.setText("햄스터(hamster)는 비단털쥐과 동물의 통칭 또는 시리아햄스터 한 종만을 부르는 말이다. 실험용 또는 애완용으로 기른다. 햄스터는 쥐목 비단털쥐과의 포유류이다. 애완용 햄스터의 종류로는 시리아햄스터(골든햄스터)와 이보다 작은 드워프햄스터 계열인 중가리아햄스터, 캠벨햄스터, 로보로브스키햄스터, 중국햄스터 등이 있다. 햄스터는 꼬리가 짧고 음식을 저장하는 볼주머니가 있는 것이 특징이며 앞니가 평생 자라기 때문에 항상 이갈이를 마련해 주어야 한다");
                mediaPlayer = MediaPlayer.create(ExplainActivity.this, R.raw.hamster);

                break;

            case "25":
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.mouse));
                textexplain.setText("털은 길이가 약 5mm이고 몸빛깔은 회갈색이며 은빛 나는 털이 섞여 있다. 몸의 아랫면은 일본산 땃쥐류보다 연한 색이다. 앞·뒷발의 표면은 회백색이고 꼬리는 보통 크기로 짧은 털이 밀생하며 긴 털도 많아서 꼬리 끝까지 이어져 있고 윗면은 갈색이고 아랫면은 백색이다.");
                mediaPlayer = MediaPlayer.create(ExplainActivity.this, R.raw.ddatmouse);

                break;

            case "26":
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.crocodile));
                textexplain.setText("악어의 조상은 중생대 트라이아스기 말에서 쥐라기 초에 나타난 프로토수쿠스(Protosuchus)이다. 이 화석종은 생존 중에 거의 진화를 거치지 않은 대형 파충류로서 악어류를 연구하는 데 없어서는 안 될 귀중한 자료이다. 분류학상으로는 크로커다일과·앨리게이터과의 2과 9속 23종으로 나뉜다. 몸은 수중생활에 알맞은 구조를 하고 있다. 머리가 크고 넓으며, 주둥이는 가늘고 길다. 뒷다리에는 물갈퀴가 발달하였으며 앞다리의 발가락은 5개, 뒷다리는 4개이다. 꼬리는 강하고 커서 헤엄치거나 먹이를 잡을 때 쓰인다.");
                mediaPlayer = MediaPlayer.create(ExplainActivity.this, R.raw.crocodile);

                break;

            case "27":
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.bukgkgom));
                textexplain.setText("세계 최대의 육상 포식자, 완벽에 가까운 살상 병기, 북극곰은 영겁의 세월 동안 반달무늬물범을 상대로 생존 경쟁을 벌여왔습니다. 반달무늬물범이 전술로 대응한다면 북극곰은 은밀함과 힘으로 승부합니다. 환경이 급변하면서 더 많은 난관이 발생하기 때문에 북극곰과 반달무늬물범은 새로운 전술을 계속 개발하고 끊임없이 변하는 규칙에 적응하며 생존 경쟁을 펼쳐야 합니다. 진화를 거듭한 행동 양식과 생체 역학의 대결, 이제 포식자의 눈을 통해 그 전모가 밝혀집니다.");
                mediaPlayer = MediaPlayer.create(ExplainActivity.this, R.raw.bukgkgom);

                break;

            case "28":
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.horse));
                textexplain.setText("말의 몸은 달리기에 알맞도록 네 다리와 목이 길다. 얼굴도 긴데, 이것은 치열(齒列)이 길기 때문이다. 코에는 나출부(裸出部)가 없고, 윗입술을 잘 움직이는데, 이것으로 풀을 입 안으로 밀어넣는다. 초식성으로 생초·건초·곡물을 먹는다. 전후지(前後肢)는 모두 제3지(第三指)만이 발달하여 겉보기에는 하나이지만, 제2지 및 제4지의 중수골(中手骨)·중족골(中足骨)은 약간 남아 있다. 발굽은 하나이며, 너비가 넓고 튼튼하다. 두정부(頭頂部)에는 앞머리털이 있고, 목덜미에는 갈기가 있으며, 가슴이 크고, 늑골은 18쌍이나 된다.");
                mediaPlayer = MediaPlayer.create(ExplainActivity.this, R.raw.horse);
                break;

            case "29":
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.tiger));
                textexplain.setText("생물종 분류로는 고양이과에 속하며 사자, 표범, 재규어와 근연속(Panthera)이다. 검은 가로줄무늬가 특징적인데, 생후부터 성장 후에도 남아 있다. 몸통은 길고 발은 비교적 짧고 코와 입끝의 폭이 좁다. 귀는 폭이 좁고 그 등면은 검은색이며 중앙에 크고 흰 얼룩점이 있다. 수컷은 암컷보다 크고 강한 턱과 긴 송곳니가 특징이다. 발톱의 발달이 좋고 특히 첫째, 즉 엄지발톱이 강력하다. 보통 때에는 발톱집 속에 넣어 둔다.");
                mediaPlayer = MediaPlayer.create(ExplainActivity.this, R.raw.tiger_lion_lion);
                break;

            case "30":
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.sasm));
                textexplain.setText("몸길이 30∼310㎝, 어깨높이 20∼235㎝로, 소형종에서 대형종에 이르기까지 크기가 다양하다. 암컷은 수컷보다 몸집이 약간 작고, 뿔이 없다. 뿔은 중실(中實)로서 골질의 가지뿔과 가지의 수는 나이나 장소에 따라 다르다. 즉, 충분히 성장한 개체에서는 보통 가지의 끝이 4개 있는 3차(叉) 4첨(尖)으로 가지를 친다.");
                mediaPlayer = MediaPlayer.create(ExplainActivity.this, R.raw.sasm);

                break;


            case "31":
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.hama));
                textexplain.setText("하마과에는 하마(Hippopotamus amphibius)와 애기하마(Choeropsis liberiensis) 2속 2종이 있다. 아프리카의 대표적인 동물로서 아프리카 사하라사막 이남의 하천·호수·늪 등에서 서식해왔는데, 현재는 각 지방에서 볼 수 있다. 애기하마는 라이베리아하마·피그미하마라고도 하며, 서아프리카의 라이베리아·시에라리온·코트디부아르에만 분포하고, 습도가 높은 산림 중의 늪지나 강 부근에 서식한다.");
                mediaPlayer = MediaPlayer.create(ExplainActivity.this, R.raw.hama);
                break;
            default:
                    Toast.makeText(this, "Doesnt find animal!!", Toast.LENGTH_SHORT).show();
        }

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mediaPlayer != null){
                    IsPlaying();
                }
                else{
                    mediaPlayer = MediaPlayer.create(ExplainActivity.this, R.raw.turtle);
                    IsPlaying();
                }
            }

            public void IsPlaying() {
                mediaPlayer.start();
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mediaPlayer != null){
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }

}
