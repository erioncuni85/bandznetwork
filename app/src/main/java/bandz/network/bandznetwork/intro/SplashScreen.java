package bandz.network.bandznetwork.intro;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.shashank.sony.fancywalkthroughlib.FancyWalkthroughActivity;
import com.shashank.sony.fancywalkthroughlib.FancyWalkthroughCard;

import java.util.ArrayList;
import java.util.List;

import bandz.network.bandznetwork.R;

public class SplashScreen extends FancyWalkthroughActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_splash_screen);
       // Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        FancyWalkthroughCard fancywalkthroughCard1 = new FancyWalkthroughCard("Global Extranet", "The BandZ vision is create an ultrafast, ubiquitous, “distributedly-managed” global extranet powered by Blockchain.",R.drawable.ic_network_check_black_24dp);
        FancyWalkthroughCard fancywalkthroughCard2 = new FancyWalkthroughCard("VPN security", "All of the individual peers will be their own intranets and provide each other with enterprise grade VPN security and robust internet connectivity.",R.drawable.ic_network_check_black_24dp);
        FancyWalkthroughCard fancywalkthroughCard3 = new FancyWalkthroughCard("Token", "They will pay each other with bandwidth denominated in BandZ (the token) so that the system pays everyone within it as the members use it.",R.drawable.ic_network_check_black_24dp);
        //FancyWalkthroughCard fancywalkthroughCard4 = new FancyWalkthroughCard("Meal is on the way", "Get ready and comfortable while our biker bring your meal at your door.",R.drawable.ic_network_check_black_24dp);

        fancywalkthroughCard1.setBackgroundColor(R.color.white);
        fancywalkthroughCard1.setIconLayoutParams(300,300,0,0,0,0);
        fancywalkthroughCard2.setBackgroundColor(R.color.white);
        fancywalkthroughCard2.setIconLayoutParams(300,300,0,0,0,0);
        fancywalkthroughCard3.setBackgroundColor(R.color.white);
        fancywalkthroughCard3.setIconLayoutParams(300,300,0,0,0,0);
        //fancywalkthroughCard4.setBackgroundColor(R.color.white);
        List<FancyWalkthroughCard> pages = new ArrayList<>();

        pages.add(fancywalkthroughCard1);
        pages.add(fancywalkthroughCard2);
        pages.add(fancywalkthroughCard3);
        //pages.add(fancywalkthroughCard4);

        for (FancyWalkthroughCard page : pages) {
            page.setTitleColor(R.color.white);
            fancywalkthroughCard3.setBackgroundColor(R.color.colorRed);
            page.setDescriptionColor(R.color.white);
        }
        setFinishButtonTitle("Get Started");
        showNavigationControls(true);
        setColorBackground(R.color.colorRed);
        //setImageBackground(R.drawable.restaurant);
        setInactiveIndicatorColor(R.color.grey_600);
        setActiveIndicatorColor(R.color.colorGreen);
        setOnboardPages(pages);

    }

    @Override
    public void onFinishButtonPressed() {

    }

}
