package com.example.snakeandladder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.content.res.AppCompatResources;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView pl1dice, pl2dice;
    private View diceplayer1, diceplayer2;
    private View p1winner;
    private TextView winner, sorl;

    View[][] array = new View[7][7];
    View[][] arrayp2 = new View[7][7];
    int random, count = 0;
    int random2, count2 = 0;
    int c1, c2, c3, c4, c5, c6, c7;
    int C1, C2, C3, C4, C5, C6, C7;

    int[][] idarr_player1 = {
            {R.id.view1, R.id.view2, R.id.view3, R.id.view4, R.id.view5, R.id.view6, R.id.view7},
            {R.id.view8, R.id.view9, R.id.view10, R.id.view11, R.id.view12, R.id.view13, R.id.view14},
            {R.id.view15, R.id.view16, R.id.view17, R.id.view18, R.id.view19, R.id.view20, R.id.view21},
            {R.id.view22, R.id.view23, R.id.view24, R.id.view25, R.id.view26, R.id.view27, R.id.view28},
            {R.id.view29, R.id.view30, R.id.view31, R.id.view32, R.id.view33, R.id.view34, R.id.view35},
            {R.id.view36, R.id.view37, R.id.view38, R.id.view39, R.id.view40, R.id.view41, R.id.view42},
            {R.id.view43, R.id.view44, R.id.view45, R.id.view46, R.id.view47, R.id.view48, R.id.view49}
    };

    int[][] idarr_player2 = {
            {R.id.view1p2, R.id.view2p2, R.id.view3p2, R.id.view4p2, R.id.view5p2, R.id.view6p2, R.id.view7p2},
            {R.id.view8p2, R.id.view9p2, R.id.view10p2, R.id.view11p2, R.id.view12p2, R.id.view13p2, R.id.view14p2},
            {R.id.view15p2, R.id.view16p2, R.id.view17p2, R.id.view18p2, R.id.view19p2, R.id.view20p2, R.id.view21p2},
            {R.id.view22p2, R.id.view23p2, R.id.view24p2, R.id.view25p2, R.id.view26p2, R.id.view27p2, R.id.view28p2},
            {R.id.view29p2, R.id.view30p2, R.id.view31p2, R.id.view32p2, R.id.view33p2, R.id.view34p2, R.id.view35p2},
            {R.id.view36p2, R.id.view37p2, R.id.view38p2, R.id.view39p2, R.id.view40p2, R.id.view41p2, R.id.view42p2},
            {R.id.view43p2, R.id.view44p2, R.id.view44p2, R.id.view45p2, R.id.view46p2, R.id.view47p2, R.id.view48p2},
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pl1dice = findViewById(R.id.pl1dice);
        pl2dice = findViewById(R.id.pl2dice);
        diceplayer1 = findViewById(R.id.diceplayer1);
        diceplayer2 = findViewById(R.id.diceplayer2);
        winner = findViewById(R.id.winner);
        sorl = findViewById(R.id.sorl);



        for(int i=0; i<7; i++)
        {
            for(int j=0; j<7; j++)
            {
                array[i][j] = findViewById(idarr_player1[i][j]);
                arrayp2[i][j] = findViewById(idarr_player2[i][j]);
            }
        }

        diceplayer1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                sorl.setText("");
                int min = 1;
                int max = 6;
                random = (int)(Math.random()*(max-min+1)+min);
                String Random = Integer.toString(random);
                pl1dice.setText(Random);
               count = count + random;


                if(count<7) {
                        c1 = count;
                        if(count == 5)
                        {
                            sorl.setText("Yayy! It's a ladder!");
                           // sorl.setTextColor(getResources().getColor(R.color.green));
                            for (int i = 0; i < 7; i++) {
                                for (int j = 0; j < 7; j++) {
                                    array[j][i].setBackgroundResource(R.drawable.player1);
                                }
                            }
                            array[3][2].setBackgroundResource(R.drawable.player1active);
                            count = 23;
                        }
                        else {
                            for (int i = 0; i < 7; i++) {
                                for (int j = 0; j < 1; j++) {
                                    array[j][i].setBackgroundResource(R.drawable.player1);
                                }
                            }
                            array[0][c1].setBackgroundResource(R.drawable.player1active);
                        }
                }


                else if(count>=7 && count<14)
                {
                    c2 = count - 7;
                    if(count == 12)
                    {
                        sorl.setText("Yayy! It's a ladder!");
                       // sorl.setTextColor(getResources().getColor(R.color.green));
                        for (int i = 0; i < 7; i++) {
                            for (int j = 0; j < 7; j++) {
                                array[j][i].setBackgroundResource(R.drawable.player1);
                            }
                        }
                        array[4][2].setBackgroundResource(R.drawable.player1active);
                        count = 30;
                    }
                    else {
                        for (int i = 0; i < 7; i++) {
                            for (int j = 0; j < 2; j++) {
                                array[j][i].setBackgroundResource(R.drawable.player1);
                            }
                        }
                        array[1][c2].setBackgroundResource(R.drawable.player1active);
                    }
                }


                else if(count>=14 && count<21)
                {
                    c3 = count - 14;
                    for(int i=0; i<7; i++)
                    {
                        for(int j=0; j<3; j++)
                        {
                            array[j][i].setBackgroundResource(R.drawable.player1);
                        }
                    }
                    array[2][c3].setBackgroundResource(R.drawable.player1active);
                }


                else if(count>=21 && count<28)
                {
                    c4 = count - 21;

                    for(int i=0; i<7; i++)
                    {
                        for(int j=0; j<4; j++)
                        {
                            array[j][i].setBackgroundResource(R.drawable.player1);
                        }
                    }
                    array[3][c4].setBackgroundResource(R.drawable.player1active);
                }


                else if(count>=28 && count<35)
                {
                    c5 = count - 28;

                    for(int i=0; i<7; i++)
                    {
                        for(int j=0; j<5; j++)
                        {
                            array[j][i].setBackgroundResource(R.drawable.player1);
                        }
                    }
                    array[4][c5].setBackgroundResource(R.drawable.player1active);
                }


                else if(count>=35 && count<42)
                {
                        c6 = count - 35;
                    if(count == 40)
                    {
                        sorl.setText("Oh no! It's a snake!");
                        sorl.setTextColor(getResources().getColor(R.color.red));
                        for (int i = 0; i < 7; i++) {
                            for (int j = 0; j < 7; j++) {
                                array[j][i].setBackgroundResource(R.drawable.player1);
                            }
                        }
                        array[1][6].setBackgroundResource(R.drawable.player1active);
                        count = 13;
                    }
                    else {
                        for (int i = 0; i < 7; i++) {
                            for (int j = 0; j < 6; j++) {
                                array[j][i].setBackgroundResource(R.drawable.player1);
                            }
                        }
                        array[5][c6].setBackgroundResource(R.drawable.player1active);
                    }
                }

                else if(count>=42 && count<49) {
                            c7 = count - 42;
                    if(count == 46)
                    {
                        sorl.setText("Oh no! It's a snake!");
                        sorl.setTextColor(getResources().getColor(R.color.red));
                        for (int i = 0; i < 7; i++) {
                            for (int j = 0; j < 7; j++) {
                                array[j][i].setBackgroundResource(R.drawable.player1);
                            }
                        }
                        array[2][5].setBackgroundResource(R.drawable.player1active);
                        count = 19;
                    }
                   else  if (count == 48) {
                        for (int i = 0; i < 7; i++) {
                            for (int j = 0; j < 7; j++) {
                                array[j][i].setBackgroundResource(R.drawable.player1);
                            }
                        }
                        winner.setText("Player 1 is winner !");
                        array[6][6].setBackgroundResource(R.drawable.player1active);
                    }
                    else {
                        for (int i = 0; i < 7; i++) {
                            for (int j = 0; j < 7; j++) {
                                array[j][i].setBackgroundResource(R.drawable.player1);
                            }
                        }
                        array[6][c7].setBackgroundResource(R.drawable.player1active);
                    }
                }

                else if(count>=49)
                {
                    count = count-random;
                }
            }
        });

        diceplayer2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                sorl.setText("");
                int min2 = 1;
                int max2 = 3;
                random2 = (int)(Math.random()*(max2-min2+1)+min2);
                String Random2 = Integer.toString(random2);
                pl2dice.setText(Random2);
                count2 = count2 + random2;


                if(count2<7) {
                    C1 = count2;
                    if(count2 == 5)
                    {
                        sorl.setText("Yayy! It's a ladder!");
                       // sorl.setTextColor(getResources().getColor(R.color.green));
                        for (int i = 0; i < 7; i++) {
                            for (int j = 0; j < 7; j++) {
                                arrayp2[j][i].setBackgroundResource(R.drawable.player2);
                            }
                        }
                        arrayp2[3][2].setBackgroundResource(R.drawable.player2active);
                        count2 = 23;
                    }
                    else {
                        for (int i = 0; i < 7; i++) {
                            for (int j = 0; j < 1; j++) {
                                arrayp2[j][i].setBackgroundResource(R.drawable.player2);
                            }
                        }
                        arrayp2[0][C1].setBackgroundResource(R.drawable.player2active);
                    }
                }


                else if(count2>=7 && count2<14)
                {
                    C2 = count2 - 7;
                    if(count2 == 12)
                    {
                        sorl.setText("Yayy! It's a ladder!");
                       // sorl.setTextColor(getResources().getColor(R.color.green));
                        for (int i = 0; i < 7; i++) {
                            for (int j = 0; j < 7; j++) {
                                arrayp2[j][i].setBackgroundResource(R.drawable.player2);
                            }
                        }
                        arrayp2[4][2].setBackgroundResource(R.drawable.player2active);
                        count2 = 30;
                    }
                    else {
                        for (int i = 0; i < 7; i++) {
                            for (int j = 0; j < 2; j++) {
                                arrayp2[j][i].setBackgroundResource(R.drawable.player2);
                            }
                        }
                        arrayp2[1][C2].setBackgroundResource(R.drawable.player2active);
                    }
                }


                else if(count2>=14 && count2<21)
                {
                    C3 = count2 - 14;
                    for(int i=0; i<7; i++)
                    {
                        for(int j=0; j<3; j++)
                        {
                            arrayp2[j][i].setBackgroundResource(R.drawable.player2);
                        }
                    }
                    arrayp2[2][C3].setBackgroundResource(R.drawable.player2active);
                }


                else if(count2>=21 && count2<28)
                {
                    C4 = count2 - 21;

                    for(int i=0; i<7; i++)
                    {
                        for(int j=0; j<4; j++)
                        {
                            arrayp2[j][i].setBackgroundResource(R.drawable.player2);
                        }
                    }
                    arrayp2[3][C4].setBackgroundResource(R.drawable.player2active);
                }


                else if(count2>=28 && count2<35)
                {
                    C5 = count2 - 28;

                    for(int i=0; i<7; i++)
                    {
                        for(int j=0; j<5; j++)
                        {
                            arrayp2[j][i].setBackgroundResource(R.drawable.player2);
                        }
                    }
                    arrayp2[4][C5].setBackgroundResource(R.drawable.player2active);
                }


                else if(count2>=35 && count2<42)
                {
                    C6 = count2 - 35;
                    if(count2 == 40)
                    {
                        sorl.setText("Oh no! It's a snake!");
                        sorl.setTextColor(getResources().getColor(R.color.red));
                        for (int i = 0; i < 7; i++) {
                            for (int j = 0; j < 7; j++) {
                                arrayp2[j][i].setBackgroundResource(R.drawable.player2);
                            }
                        }
                        arrayp2[1][6].setBackgroundResource(R.drawable.player2active);
                        count2 = 13;
                    }
                    else {
                        for (int i = 0; i < 7; i++) {
                            for (int j = 0; j < 6; j++) {
                                arrayp2[j][i].setBackgroundResource(R.drawable.player2);
                            }
                        }
                        arrayp2[5][C6].setBackgroundResource(R.drawable.player2active);
                    }
                }

                else if(count2>=42 && count2<49) {
                    C7 = count2 - 42;
                    if(count2 == 46)
                    {
                        sorl.setText("Oh no! It's a snake!");
                        sorl.setTextColor(getResources().getColor(R.color.red));
                        for (int i = 0; i < 7; i++) {
                            for (int j = 0; j < 7; j++) {
                                arrayp2[j][i].setBackgroundResource(R.drawable.player2);
                            }
                        }
                        arrayp2[2][5].setBackgroundResource(R.drawable.player2active);
                        count2 = 19;
                    }
                    else  if (count2 == 48) {
                        for (int i = 0; i < 7; i++) {
                            for (int j = 0; j < 7; j++) {
                                arrayp2[j][i].setBackgroundResource(R.drawable.player2);
                            }
                        }
                        winner.setText("Player 2 is winner !");
                        arrayp2[6][6].setBackgroundResource(R.drawable.player2active);
                    }
                    else {
                        for (int i = 0; i < 7; i++) {
                            for (int j = 0; j < 7; j++) {
                                arrayp2[j][i].setBackgroundResource(R.drawable.player2);
                            }
                        }
                        arrayp2[6][C7].setBackgroundResource(R.drawable.player2active);
                    }
                }

                else if(count2>=49)
                {
                    count2 = count2-random2;
                }
            }
        });
    }
}