

package com.example.sam19.mathblast;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.TextView;
        import android.widget.Toast;

public class Splash extends AppCompatActivity {
    String iddd;
TextView mode,num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        num=(TextView)findViewById(R.id.textView);
        mode=(TextView)findViewById(R.id.textView1);



        Intent in = getIntent();

        Bundle b = in.getExtras();


        iddd = b.getString("idd");
        int gett;
        gett=Integer.parseInt(iddd);


        if(gett==1) {


            Thread myThread = new Thread() {
                @Override
                public void run() {
                    mode.setText("Difficulty level = easy");
                    num.setText("Nubmer of questions = 20");

                    try {
                        sleep(1500);
                        Intent intent = new Intent(Splash.this, easyadd.class);
                        startActivity(intent);
                        finish();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
            };
            myThread.start();
        }




        if(gett==2) {


            Thread myThread = new Thread() {
                @Override
                public void run() {
                    mode.setText("Difficulty level = Medium");
                    num.setText("Nubmer of questions = 20");


                    try {
                        sleep(1500);
                        Intent intent = new Intent(Splash.this, easyaddmed.class);
                        startActivity(intent);
                        finish();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
            };
            myThread.start();
        }




        if(gett==3) {


            Thread myThread = new Thread() {
                @Override
                public void run() {
                    mode.setText("Difficulty level = hard");
                    num.setText("Nubmer of questions = 20");

                    try {
                        sleep(1500);
                        Intent intent = new Intent(Splash.this, easyaddhrd.class);
                        startActivity(intent);
                        finish();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
            };
            myThread.start();
        }






        if(gett==4) {


            Thread myThread = new Thread() {
                @Override
                public void run() {
                    mode.setText("Difficulty level = easy");
                    num.setText("Nubmer of questions = 20");

                    try {
                        sleep(1500);
                        Intent intent = new Intent(Splash.this, easyadd.class);
                        startActivity(intent);
                        finish();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
            };
            myThread.start();
        }




        if(gett==5) {


            Thread myThread = new Thread() {
                @Override
                public void run() {
                    mode.setText("Difficulty level = Medium");
                    num.setText("Nubmer of questions = 20");


                    try {
                        sleep(1500);
                        Intent intent = new Intent(Splash.this, easyaddmed.class);
                        startActivity(intent);
                        finish();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
            };
            myThread.start();
        }




        if(gett==6) {


            Thread myThread = new Thread() {
                @Override
                public void run() {
                    mode.setText("Difficulty level = hard");
                    num.setText("Nubmer of questions = 20");

                    try {
                        sleep(1500);
                        Intent intent = new Intent(Splash.this, easyaddhrd.class);
                        startActivity(intent);
                        finish();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
            };
            myThread.start();
        }





        if(gett==7) {


            Thread myThread = new Thread() {
                @Override
                public void run() {
                    mode.setText("Difficulty level = easy");
                    num.setText("Nubmer of questions = 20");

                    try {
                        sleep(1500);
                        Intent intent = new Intent(Splash.this, easymod.class);
                        startActivity(intent);
                        finish();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
            };
            myThread.start();
        }




        if(gett==8) {


            Thread myThread = new Thread() {
                @Override
                public void run() {
                    mode.setText("Difficulty level = Medium");
                    num.setText("Nubmer of questions = 20");


                    try {
                        sleep(1500);
                        Intent intent = new Intent(Splash.this, medmod.class);
                        startActivity(intent);
                        finish();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
            };
            myThread.start();
        }




        if(gett==9) {


            Thread myThread = new Thread() {
                @Override
                public void run() {
                    mode.setText("Difficulty level = hard");
                    num.setText("Nubmer of questions = 20");

                    try {
                        sleep(1500);
                        Intent intent = new Intent(Splash.this, hrdmod.class);
                        startActivity(intent);
                        finish();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
            };
            myThread.start();
        }









        if(gett==10) {


            Thread myThread = new Thread() {
                @Override
                public void run() {
                    mode.setText("Difficulty level = easy");
                    num.setText("Nubmer of questions = 20");

                    try {
                        sleep(1500);
                        Intent intent = new Intent(Splash.this, easymull.class);
                        startActivity(intent);
                        finish();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
            };
            myThread.start();
        }




        if(gett==11) {


            Thread myThread = new Thread() {
                @Override
                public void run() {
                    mode.setText("Difficulty level = Medium");
                    num.setText("Nubmer of questions = 20");


                    try {
                        sleep(1500);
                        Intent intent = new Intent(Splash.this, medmull.class);
                        startActivity(intent);
                        finish();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
            };
            myThread.start();
        }




        if(gett==12) {


            Thread myThread = new Thread() {
                @Override
                public void run() {
                    mode.setText("Difficulty level = hard");
                    num.setText("Nubmer of questions = 20");

                    try {
                        sleep(1500);
                        Intent intent = new Intent(Splash.this, hrdmull.class);
                        startActivity(intent);
                        finish();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
            };
            myThread.start();
        }











        if(gett==13) {


            Thread myThread = new Thread() {
                @Override
                public void run() {
                    mode.setText("Difficulty level = easy");
                    num.setText("Nubmer of questions = 20");

                    try {
                        sleep(1500);
                        Intent intent = new Intent(Splash.this, easysub.class);
                        startActivity(intent);
                        finish();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
            };
            myThread.start();
        }




        if(gett==14) {


            Thread myThread = new Thread() {
                @Override
                public void run() {
                    mode.setText("Difficulty level = Medium");
                    num.setText("Nubmer of questions = 20");


                    try {
                        sleep(1500);
                        Intent intent = new Intent(Splash.this, medsub.class);
                        startActivity(intent);
                        finish();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
            };
            myThread.start();
        }




        if(gett==15) {


            Thread myThread = new Thread() {
                @Override
                public void run() {
                    mode.setText("Difficulty level = hard");
                    num.setText("Nubmer of questions = 20");

                    try {
                        sleep(1500);
                        Intent intent = new Intent(Splash.this, hrdsub.class);
                        startActivity(intent);
                        finish();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
            };
            myThread.start();
        }




        if(gett==16) {


            Thread myThread = new Thread() {
                @Override
                public void run() {
                    mode.setText("Difficulty level = hard");
                    num.setText("Nubmer of questions = 30");

                    try {
                        sleep(1500);
                        Intent intent = new Intent(Splash.this, test.class);
                        startActivity(intent);
                        finish();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
            };
            myThread.start();
        }














    }
}





