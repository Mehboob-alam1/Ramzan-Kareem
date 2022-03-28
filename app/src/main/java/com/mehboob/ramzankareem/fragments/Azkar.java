package com.mehboob.ramzankareem.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mehboob.ramzankareem.R;
import com.mehboob.ramzankareem.adapters.AzkarAdapter;
import com.mehboob.ramzankareem.models.AzkarModel;

import java.util.ArrayList;


public class Azkar extends Fragment {
ArrayList<AzkarModel> list;
AzkarAdapter adapter;
RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_azkar, container, false);
        recyclerView= view.findViewById(R.id.recyclerView);
        list=new ArrayList<>();
        list.add(new AzkarModel("When Waking Up","جاگتے وقت","الحَمْـدُ لِلّهِ الّذي أَحْـيانا بَعْـدَ ما أَماتَـنا وَإليه النُّـشور","All praise is for Allah who gave us life after having taken it from us and unto Him is the resurrection."));
        list.add(new AzkarModel(" When Wearing Clothes","جب کپڑے پہنتے ہیں۔","الحمدُ للهِ الّذي كَساني هذا (الثّوب) وَرَزَقَنيه مِنْ غَـيـْرِ حَولٍ مِنّي وَلا قـوّة","All Praise is for Allah who has clothed me with this garment and provided it for me, with no power nor might from myself."));
        list.add(new AzkarModel("Before Undressing","کپڑے اتارنے سے پہلے","بِسْمِ الله","In the name of Allah."));
        list.add(new AzkarModel("Before Entering the Toilet","ٹوائلٹ میں داخل ہونے سے پہلے","بِسْمِ الله – اللّهُـمَّ إِنِّـي أَعـوذُ بِـكَ مِـنَ الْخُـبْثِ وَالْخَبائِث","In the name of Allah. O Allah, I take refuge with you from all evil and evil-doers."));
        list.add(new AzkarModel("After Leaving the Toilet","ٹوائلٹ چھوڑنے کے بعد","غُفْـرانَك","I ask You (Allah) for forgiveness."));
        list.add(new AzkarModel("When Exiting the House","گھر سے باہر نکلتے وقت","بِسْمِ اللهِ ، تَوَكَّلْـتُ عَلى اللهِ وَلا حَوْلَ وَلا قُـوَّةَ إِلاّ بِالله","In the name of Allah, I place my trust in Allah, and there is no might nor power except with Allah."));
        list.add(new AzkarModel("When Entering the House","گھر میں داخل ہوتے وقت","بِسْـمِ اللهِ وَلَجْنـا، وَبِسْـمِ اللهِ خَـرَجْنـا، وَعَلـى رَبِّنـا تَوَكّلْـنا","In the name of Allah we enter and in the name of Allah we leave, and upon our Lord we place our trust."));
        list.add(new AzkarModel("When Going to the Mosque","مسجد میں جاتے وقت","\n" +
                "اللّهُـمَّ اجْعَـلْ في قَلْبـي نورا ، وَفي لِسـاني نورا، وَاجْعَـلْ في سَمْعي نورا، وَاجْعَـلْ في بَصَري نورا، وَاجْعَـلْ مِنْ خَلْفي نورا، وَمِنْ أَمامـي نورا، وَاجْعَـلْ مِنْ فَوْقـي نورا ، وَمِن تَحْتـي نورا .اللّهُـمَّ أَعْطِنـي نورا","O Allah, place within my heart light, and upon my tongue light, and within my ears light, and within my eyes light, and place behind me light and in front of me light and above me light and beneath me light. O Allah, bestow upon me light."));
        list.add(new AzkarModel("When Entering the Mosque","مسجد میں داخل ہوتے وقت","اعوذُ باللهِ العَظيـم وَبِوَجْهِـهِ الكَرِيـم وَسُلْطـانِه القَديـم مِنَ الشّيْـطانِ الرَّجـيم، بِسْـمِ الله، وَالصَّلاةُ وَالسَّلامُ عَلى رَسولِ الله، اللّهُـمَّ افْتَـحْ لي أَبْوابَ رَحْمَتـِك","I take refuge with Allah, The Supreme and with His Noble Face, and His eternal authority from the accursed devil. In the name of Allah, and prayers and peace be upon the Messenger of Allah. O Allah, open the gates of Your mercy for me."));
        list.add(new AzkarModel("When Exiting the Mosque","مسجد سے باہر نکلتے وقت","بِسمِ الله وَالصّلاةُ وَالسّلامُ عَلى رَسولِ الله، اللّهُـمَّ إِنّـي أَسْأَلُكَ مِـنْ فَضْـلِك، اللّهُـمَّ اعصِمْنـي مِنَ الشَّيْـطانِ الرَّجـيم" ,"In the name of Allah, and prayers and peace be upon the Messenger of Allah. O Allah, I ask You from Your favor. O Allah, guard me from the accursed devil."));
        list.add(new AzkarModel("After Completing the Ablution (Wudu)","وضو مکمل کرنے کے بعد","أَشْهَـدُ أَنْ لا إِلَـهَ إِلاّ اللهُ وَحْدَهُ لا شَريـكَ لَـهُ وَأَشْهَدُ أَنَّ مُحَمّـداً عَبْـدُهُ وَرَسـولُـه. اللّهُـمَّ اجْعَلنـي مِنَ التَّـوّابينَ وَاجْعَـلْني مِنَ المتَطَهّـرين","I bear witness that none has the right to be worshipped except Allah, alone without partner, and I bear witness that Muhammad is His slave and Messenger. O Allah, make me of those who return to You often in repentance and make me of those who remain clean and pure."));
        list.add(new AzkarModel("After the Adhan (Call to Prayer)","اذان کے بعد ","\n" +
                "اللّهُـمَّ رَبَّ هَذِهِ الدّعْـوَةِ التّـامَّة وَالصّلاةِ القَـائِمَة آتِ محَـمَّداً الوَسيـلةَ وَالْفَضـيلَة وَابْعَـثْه مَقـامـاً مَحـموداً الَّذي وَعَـدْتَه إِنَّـكَ لا تُـخْلِفُ الميـعاد","O Allah, Owner of this perfect call and Owner of this prayer to be performed, bestow upon Muhammad al-waseelah and al-fadeelah and send him upon a praised platform which You have promised him. Verily, You never fail in Your promise.’"));
        list.add(new AzkarModel("After the End of an Obligatory Prayer (Fardh)","فرض نماز کے اختتام کے بعد ","لا إلهَ إلاّ اللّهُ وحدَهُ لا شريكَ لهُ، لهُ المُـلْكُ ولهُ الحَمْد، وهوَ على كلّ شَيءٍ قَدير، اللّهُـمَّ لا مانِعَ لِما أَعْطَـيْت، وَلا مُعْطِـيَ لِما مَنَـعْت، وَلا يَنْفَـعُ ذا الجَـدِّ مِنْـكَ الجَـد","None has the right to be worshipped except Allah, alone, without partner, to Him belongs all sovereignty and praise and He is over all things omnipotent.O Allah, none can prevent what You have willed to bestow and none can bestow what You have willed to prevent, and no wealth or majesty can benefit anyone, as from You is all wealth and majesty."));
        list.add(new AzkarModel("For Seeking Guidance After Forming a Decision (Istikhara)","فیصلہ کرنے کے بعد رہنمائی حاصل کرنے کے لیے (استخارہ)","اللّهُـمَّ إِنِّـي أَسْتَخيـرُكَ بِعِاْـمِك، وَأسْتَقْـدِرُكَ بِقُـدْرَتِـك، وَأَسْـألُـكَ مِنْ فَضْـلِكَ العَظـيم، فَإِنَّـكَ تَقْـدِرُ وَلا أَقْـدِر، وَتَـعْلَـمُ وَلا أَعْلَـم، وَأَنْـتَ عَلاّمُ الغُـيوب، اللّهُـمَّ إِنْ كُنْـتَ تَعْـلَمُ أَنَّ هـذا الأمْـرَ- وَيُسَـمِّي حاجَتَـه – خَـيْرٌ لي في دينـي وَمَعـاشي وَعاقِـبَةِ أَمْـري، فَاقْـدُرْهُ لي وَيَسِّـرْهُ لي ثـمَّ بارِكْ لي فيـه، وَإِنْ كُنْـتَ تَعْـلَمُ أَنَّ هـذا الأمْـرَ شَـرٌ لي في دينـي وَمَعـاشي وَعاقِـبَةِ أَمْـري، فَاصْرِفْـهُ وَاصْرِفْني عَنْـهُ وَاقْـدُرْ لي الخَـيْرَ حَيْـثُ كانَ ثُـمَّ أَرْضِـني بِـه\n","O Allah, I seek Your counsel by Your knowledge and by Your power I seek strength and I ask You from Your immense favour, for verily You are able while I am not and verily You know while I do not and You are the Knower of the unseen. O Allah, if You know this affair -and here he mentions his need- to be good for me in relation to my religion, my life, and end, then decree and facilitate it for me, and bless me with it, and if You know this affair to be ill for me towards my religion, my life, and end, then remove it from me and remove me from it, and decree for me what is good wherever it be and make me satisfied with such."));
        list.add(new AzkarModel("Remembrance in the Morning and Evening","صبح و شام کا ذکر","اللّهـمَّ أَنْتَ رَبِّـي لا إلهَ إلاّ أَنْتَ ، خَلَقْتَنـي وَأَنا عَبْـدُك ، وَأَنا عَلـى عَهْـدِكَ وَوَعْـدِكَ ما اسْتَـطَعْـت ، أَعـوذُبِكَ مِنْ شَـرِّ ما صَنَـعْت ، أَبـوءُ لَـكَ بِنِعْـمَتِـكَ عَلَـيَّ وَأَبـوءُ بِذَنْـبي فَاغْفـِرْ لي فَإِنَّـهُ لا يَغْـفِرُ الذُّنـوبَ إِلاّ أَنْتَ\n","O Allah, You are my Lord, none has the right to be worshipped except You, You created me and I am Your servant and I abide to Your covenant and promise as best I can, I take refuge in You from the evil of which I have committed. I acknowledge Your favor upon me and I acknowledge my sin, so forgive me, for verily none can forgive sin except You."));
        list.add(new AzkarModel("Before Sleeping","سونے سے پہلے","بِاسْمِكَ اللَّهمَّ أَمُوْتُ وَأَحْيَا","In Your name O Allah, I live and die."));
        list.add(new AzkarModel(" When Experiencing Unrest, Fear, Apprehensiveness During Sleep","جب نیند کے دوران بے چینی، خوف، خوف کا سامنا کرنا پڑتا ہے۔","أَعُوْذُ بِكَلِمَاتِ اللَّهِ التَّامَّاتِ مِنْ غَضَبِه ِِ وَعِقَابِهِ، وَشَرِّ عِبَادِه ِِ وَمِنْ هَمَزَاتِ الشَّيْاطِيْنِ وَأَنْ يَحْضُرُوْنَ","I take refuge in the perfect words of Allah from His anger and punishment, and from the evil of His servants, and from the madness and appearance of devils."));
        list.add(new AzkarModel("For Anxiety and Sorrow","پریشانی اور غم کے لیے","اللَّهُمَّ إِنِّي أَعُوْذُ بِكَ مِنَ الهَمِّ وَالحُزْنِ، وَالعَجْزِ وَالكَسَلِ وَالبُخْلِ وَالجُبْنِ، وَضَلْعِ الدَّيْنِ وَغَلَبَةِ الرِّجَالِ","‘O Allah, I take refuge in You from anxiety and sorrow, weakness and laziness, miserliness and cowardice, the burden of debts and from being over powered by men.’"));
        list.add(new AzkarModel("One in Distress"," پریشانی میں","لا إِلَهََ إِلاَّ اللهُ العَظِيْمُ الحَلِيْمُ، لا إِلَهََ إِلاَّ اللهُ رَبُّ العَرْشِ العَظِيْمِ، لا إِلَهَ~َ إِلاَّ اللهُ رَبُّ السَّمَوَاتِ وَرَبُّ الأَرْضِ وَرَبُّ العَرْشِ الكَرِيْمِ","None has the right to be worshipped except Allah Forbearing. None has the right to be worshipped except Allah, Lord of the magnificent throne. None has the right to be worshipped except Allah, Lord of the heavens, Lord of the Earth and Lord of the noble throne."));
        list.add(new AzkarModel("One Afflicted with Doubt in Faith","ایمان میں شک میں مبتلا","آمَنْتُ بِاللهِ وَرُسُلِهِ","I have believed in Allah and His Messenger"));
        list.add(new AzkarModel("For Settling a Debt","قرض کی ادائیگی کے لیے","اللَّهمَّ اكْفِنِي بِحَلالِكَ عَنْ حَرَامِكَ، وَأَغْنِنِي بِفَضْلِكَ عَمَّنْ سِوَاكَ","‘O Allah, make what is lawful enough for me, as opposed to what is unlawful, and spare me by Your grace, of need of others.’"));
        list.add(new AzkarModel("For One Whose Affairs Have Become Difficult","جس کے معاملات مشکل ہو گئے ہوں۔","اللَّهمَّ لا سَهْلَ إِلاَّ مَا جَعَلتَه ُُ سَهْلا، ً وَأَنْتَ تَجْعَلُ الحَزَنَ إِذَا شِئْتَ سَهْلا","O Allah, there is no ease except in that which You have made easy, and You make the difficulty, if You wish, easy."));
        list.add(new AzkarModel("Placing Children Under Allah’s Protection","بچوں کو اللہ کی حفاظت میں رکھنا","أُعِيْذُكُمَا بِكَلِمَاتِ اللَّهِ التَّامَّةِ، مِنْ كُلِّ شَيْطَان ٍ وَهَامَّة، ٍ وَمِنْ كُلِّ عَيْن ٍ لامَّة","I seek refuge for both of you in the perfect words of Allah from every devil, poisonous thing, and every evil eye."));
        list.add(new AzkarModel("When Stricken with a Mishap or Overtaken by an Affair"," جب کسی حادثے کا شکار ہو یاکسی معاملے سے آگے نکل جائے۔  ","حَسْبِيَ اللَّهُ وَنِعْمَ الوَكِيْلُ","حَسْبِيَ اللَّهُ وَنِعْمَ الوَكِيْلُ"));
        list.add(new AzkarModel(" When Visiting a Sick Person","بیمار شخص کی عیادت کرتے وقت","أَسْأَلُ اللَّهَ العَظِيْمَ، رَبَّ العَرْشِ العَظِيْمِ أَنْ يَشْفِيْكَ","I ask Allah The Supreme, Lord of the magnificent throne to cure you."));
        list.add(new AzkarModel("One Afflicted By a Calamity"," آفت سے متاثر","إِنَّا للهِ وَإِنَّا إِلَيْهِ رَاجِعُوْنَ، اللَّهمَّ أْجُرْنِي فِي مُصِيْبَتِي، وَاخْلُفْ لِي خَيْرا ً مِنْهَا","To Allah we belong and unto Him is our return.O Allah, recompense me for my affliction and replace it for me with something better."));
        list.add(new AzkarModel("Supplication for the Deceased During the Funeral Prayer","نماز جنازہ کے دوران میت کے لیے دعا","اللَّهمَّ اغْفِرْ لِحَيِّنَا وَمَيِّتِنَا وَشَاهِدِنَا، وَغَائِبِنَا، وَصَغِيْرِنَا وَكَبِيْرِنَا، وَذَكَرِنَا وَأُنْثَانَا. اللَّهمَّ مَنْ أَحْيَيْتَه ُُ مِنَّا فَأَحْيِه ِِ عَلَى الإِسْلامِ، وَمَنْ تَوَفَّيْتَه ُُ مِنَّا فَتَوَفَّه ُُ عَلَى الإِيْمَانِ، اللَّهمَّ لا تَحْرِمْنَا أَجْرَهُ، وَلا تُضِلَّنَا بَعْدَهُ","O Allah, forgive our living and our dead, those present and those absent, our young and our old, our males and our females. O Allah, whom among us You keep alive, then let such a life be upon Islam, and whom among us You take unto Yourself, then let such a death be upon faith. O Allah, do not deprive us of his reward and do not let us stray after him"));
        list.add(new AzkarModel("Visiting the Cemetery","قبرستان کی زیارت کرنا","السَّلامُ عَلَيْكُمْ أَهْلَ الدِّيَارِ مِنَ المُؤْمِنِيْنَ وَالمُسْلِمِيْنَ، وَإِنَّا إِنْ شَاءَ اللَّهُ بِكُمْ لاحِقُوْنَ، نَسْأَلُ اللَّهَ لَنَا وَلَكُمُ العَافِيَةَ","Peace be upon you all, O inhabitants of the graves, among the believers and the Muslims. Verily we will, Allah willing, be united with you, we ask Allah for well-being for us and you."));
        list.add(new AzkarModel("During a Windstorm","آندھی کے دوران","اللَّهمَّ إِنِّي أَسْأَلُكَ خَيْرَهَا، وَأَعُوْذُ بِكَ مِنْ شَرِّهَا","‘O Allah, I ask You for it’s goodness and I take refuge with You from it’s evil.’"));
        list.add(new AzkarModel(" When It Rains","جب بارش ہوتی ہے۔","اللَّهُمَّ اجْعَلْهُ صَيِّبًا نَافِعًا","O Allah, may it be a beneficial rain cloud."));
        list.add(new AzkarModel("On Breaking the Fast","افطاری پر","ذَهَبَ الظَّمَأُ وَابْتَلَّتِ الْعُرُوقُ وَثَبَتَ الأَجْرُ إِنْ شَاءَ اللَّهُ","The thirst has gone and the veins are quenched, and reward is confirmed, if Allah wills."));
        list.add(new AzkarModel("Before Eating","کھانے سے پہلے","بِسْمِ اللَّهِ","In the Name of Allah"));
        list.add(new AzkarModel("If you forget and remember in the middle of eating", "کھانے کے بیچ میں بھول کر یاد آئے تو","بِسْمِ اللَّهِ فِي أَوَّلِه ِِ وَآخِرِهِ","In the name of Allah in it’s beginning and end."));
        list.add(new AzkarModel("After Eating","کھانے کے بعد","الحَمْدُ للهِ الَّذِي أَطْعَمَنِي هَذَا وَرَزَقَنِيْهِ مِنْ غَيْرِ حَوْل ٍ مِنِّي وَلا قُوَّة","All praise is for Allah who fed me this and provided it for me without any might nor power from myself."));
        list.add(new AzkarModel("Supplication for the Host","میزبان کے لیے دعا","اللَّهمَّ بَارِكْ لَهُمْ فِيْمَا رَزَقْتَهُمْ، وَاغْفِرْ لَهُمْ وَارْحَمْهُمْ","O Allah, bless for them, that which You have provided them, forgive them and have mercy upon them."));
        list.add(new AzkarModel("Before Sexual Intercourse with One’s Wife/Husband","بیوی/شوہر کے ساتھ جنسی تعلق سے پہلے","بِسْمِ اللَّهِ اللَّهمَّ جَنِّبْنَا الشَّيْطَانَ، وَجَنِّبِ الشَّيْطَانَ مَا رَزَقْتَنَا","In the name of Allah. O Allah, keep the devil away from us and keep the devil away from what you have blessed us with."));
        list.add(new AzkarModel("When Angry","جب غصہ آتا ہے۔","أَعُوْذُ بِاللَّهِ مِنَ الشَّيْطَانِ الرَّجِيْمِ","I take refuge with Allah from the accursed devil"));
        list.add(new AzkarModel("Groom’s Supplication on the Wedding Night","شادی کی رات دولہا کی دعا","اللَّهمَّ إِنِّي أَسْأَلُكَ خَيْرَهَا، وَخَيْرَ مَا جَبَلْتَهَا عَلَيْهِ، وَأَعُوْذُ بِكَ مِنْ شَرِّهَا، وَشَرِّ مَا جَبَلْتَهَا عَلَيْهِ","O Allah, I ask You for the goodness within her and the goodness that you have made her inclined towards, and I take refuge with You from the evil within her and the evil that you have made her inclined towards"));
        list.add(new AzkarModel("To the One Who Does You a Favor","وہ جو آپ پر احسان کرتا ہے۔","جَزَاكَ اللَّهُ خَيْرا","May Allah reward you with goodness"));
        list.add(new AzkarModel("Fear of Shirk","شرک کا خوف","اللّهُـمَّ إِنّـي أَعـوذُبِكَ أَنْ أُشْـرِكَ بِكَ وَأَنا أَعْـلَمْ، وَأَسْتَـغْفِرُكَ لِما لا أَعْـلَم","O Allah, I take refuge in You lest I should commit shirk with You knowingly and I seek Your forgiveness for what I do unknowingly."));
        list.add(new AzkarModel("Stopping or Lodging Somewhere","کہیں رک جانا یا قیام کرنا","أَعـوذُ بِكَلِـماتِ اللّهِ التّـامّاتِ مِنْ شَـرِّ ما خَلَـق","I take refuge in Allah’s perfect words from the evil that He has created"));
        list.add(new AzkarModel("When in Fear of a People","جب عوام کے خوف میں","اللَّهُمَّ اكْفِنِيهِمْ بِما شِئْتَ","O Allah, protect me from them with what You choose."));
        list.add(new AzkarModel("After Sneezing","چھینک کے بعد","الحَمْدُ للهِ","All praise is for Allah"));
        list.add(new AzkarModel("The listener should then respond to the one who sneezed by saying:", "پھر سننے والے کو چھینکنے والے کو یہ کہہ کر جواب دینا چاہیے","يَرْحَمُكَ اللَّهُ","May Allah have mercy upon you"));
        list.add(new AzkarModel("Then the one who sneezed should respond", "پھر جس کو چھینک آئے وہ جواب دے۔","يَهْدِيْكُمُ اللَّهُ وَيُصْلِحُ بَالَكُمْ","May Allah guide you and rectify your condition"));
        list.add(new AzkarModel("Pain in Some Part of the Body Then say seven times","جسم کے کسی حصے میں درد"," أَعُوذُ باللهِ وَقُدْرَتِهِ مَنْ شَرِّ مَا أَجِدُ وَأُحَاذِرُ","I seek refuge in the might and power of Allah from the evil of what I feel and what I fear"));
        list.add(new AzkarModel("Breaking Fast in Someone’s Home","کسی کے گھر میں روزہ افطار کرنا","أَفْطَرَ عِنْدَكُمُ الصَّائِمُوْنَ وَأَكَلَ طَعَامَكُمُ الأَبْرَارُ، وَصَلَّتْ عَلَيْكُمُ المَلائِكَةُ","May the fasting break their fast in your home, and may the dutiful and pious eat your food, and may the angels send prayers upon you."));




        adapter=new AzkarAdapter(getContext(),list);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        return view;
    }
}