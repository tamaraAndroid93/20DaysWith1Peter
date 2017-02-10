package com.peter.tewntydayswith1peter;

import android.content.res.Configuration;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.ArrayList;

public class PreviousActivity extends AppCompatActivity {
   public static  ArrayList<TextView>mList=new ArrayList<>();



    private Button mBStartHome;
    private TextView mIvDay1;
    private  TextView  mIvDay2;
    private  TextView  mIvDay3;
    private  TextView  mIvDay4;
    private  TextView  mIvDay5;
    private  TextView  mIvDay6;
    private TextView mIvDay7;
    private  TextView  mIvDay8;
    private  TextView  mIvDay9;
    private  TextView  mIvDay10;
    private  TextView  mIvDay11;
    private  TextView  mIvDay12;
    private  TextView  mIvDay13;
    private  TextView  mIvDay14;
    private  TextView  mIvDay15;
    private  TextView mIvDay16;
    private  TextView  mIvDay17;
    private  TextView  mIvDay18;
    private  TextView  mIvDay19;
    private  TextView mIvDay20;


    private MediaPlayer mediaPlayer;
    private ImageView mIvPlay;
    private boolean playing=false;
    private ImageView mIvBack;
    private ImageView mIvFast;
    private ImageView mIvNext;
    private ImageView mIvSlow;
    private int duration;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_previous);

        initComponents();
        addListenres();
    }

    @Override
    public void onConfigurationChanged(Configuration config) {

        super.onConfigurationChanged(config);
        if (config.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            setContentView(R.layout.activity_previous);
        } else if (config.orientation == Configuration.ORIENTATION_PORTRAIT){
            setContentView(R.layout.activity_previous);
        }
        initComponents();
        addListenres();

        if (mediaPlayer !=null){
            playing=true;
            mIvPlay.setImageResource(R.drawable.pause);
        }

    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle state) {
        super.onRestoreInstanceState(state);
    }
    private void addListenres() {
        mBStartHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        mIvDay1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (MainActivity.mDatabaseDate.getList_Id().size() > 0) {
                    playing = false;
                    if (mediaPlayer != null) {
                        mediaPlayer.stop();
                        mediaPlayer.release();
                        mediaPlayer = null;

                    }
                    play(MainActivity.mDatabase.getCvList_Id().get(0).getPath());
                }}
        });
        mIvDay2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (MainActivity.mDatabaseDate.getList_Id().size() > 1) {
                    playing = false;
                    if (mediaPlayer != null) {
                        mediaPlayer.stop();
                        mediaPlayer.release();
                        mediaPlayer = null;
                    }
                    play(MainActivity.mDatabase.getCvList_Id().get(1).getPath());
                }}
        });
        mIvDay3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (MainActivity.mDatabaseDate.getList_Id().size() > 2) {
                    playing = false;
                    if (mediaPlayer != null) {
                        mediaPlayer.stop();
                        mediaPlayer.release();
                        mediaPlayer = null;
                    }
                    play(MainActivity.mDatabase.getCvList_Id().get(2).getPath());
                }}
        });
        mIvDay4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (MainActivity.mDatabaseDate.getList_Id().size() > 3) {
                    mIvDay4.setTextColor(Color.BLACK);
                    playing = false;
                    if (mediaPlayer != null) {
                        mediaPlayer.stop();
                        mediaPlayer.release();
                        mediaPlayer = null;
                    }

                play(MainActivity.mDatabase.getCvList_Id().get(3).getPath());
            }}
        });
        mIvDay5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (MainActivity.mDatabaseDate.getList_Id().size() > 4) {
                    playing = false;
                    if (mediaPlayer != null) {
                        mediaPlayer.stop();
                        mediaPlayer.release();
                        mediaPlayer = null;
                    }

                play(MainActivity.mDatabase.getCvList_Id().get(4).getPath());
            }}
        });
        mIvDay6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (MainActivity.mDatabaseDate.getList_Id().size() > 5) {

                    playing = false;
                    if (mediaPlayer != null) {
                        mediaPlayer.stop();
                        mediaPlayer.release();
                        mediaPlayer = null;
                    }

                    play(MainActivity.mDatabase.getCvList_Id().get(5).getPath());
                }}
        });
        mIvDay7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (MainActivity.mDatabaseDate.getList_Id().size() > 6) {

                    playing = false;
                    if (mediaPlayer != null) {
                        mediaPlayer.stop();
                        mediaPlayer.release();
                        mediaPlayer = null;
                    }
                    play(MainActivity.mDatabase.getCvList_Id().get(6).getPath());
                }}
        });
        mIvDay8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (MainActivity.mDatabaseDate.getList_Id().size() > 7) {

                    playing = false;
                    if (mediaPlayer != null) {
                        mediaPlayer.stop();
                        mediaPlayer.release();
                        mediaPlayer = null;
                    }
                play(MainActivity.mDatabase.getCvList_Id().get(7).getPath());
            }}
        });
        mIvDay9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (MainActivity.mDatabaseDate.getList_Id().size() > 8) {

                playing=false;
                if(mediaPlayer!=null) {
                    mediaPlayer.stop();
                    mediaPlayer.release();
                    mediaPlayer = null;
                }

                play(MainActivity.mDatabase.getCvList_Id().get(8).getPath());
            }}
        });
        mIvDay10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (MainActivity.mDatabaseDate.getList_Id().size() > 9) {

                    playing = false;
                    if (mediaPlayer != null) {
                        mediaPlayer.stop();
                        mediaPlayer.release();
                        mediaPlayer = null;
                    }

                    play(MainActivity.mDatabase.getCvList_Id().get(9).getPath());
                }}
        });

        mIvDay11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (MainActivity.mDatabaseDate.getList_Id().size() > 10) {

                playing=false;
                if(mediaPlayer!=null) {
                    mediaPlayer.stop();
                    mediaPlayer.release();
                    mediaPlayer = null;
                }

                play(MainActivity.mDatabase.getCvList_Id().get(10).getPath());
            }}
        });
        mIvDay12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (MainActivity.mDatabaseDate.getList_Id().size() > 11) {

                playing=false;
                if(mediaPlayer!=null) {
                    mediaPlayer.stop();
                    mediaPlayer.release();
                    mediaPlayer = null;
                }

                play(MainActivity.mDatabase.getCvList_Id().get(11).getPath());
            }}
        });
        mIvDay13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (MainActivity.mDatabaseDate.getList_Id().size() > 12) {

                playing=false;
                if(mediaPlayer!=null) {
                    mediaPlayer.stop();
                    mediaPlayer.release();
                    mediaPlayer = null;
                }

                play(MainActivity.mDatabase.getCvList_Id().get(12).getPath());
            }}
        });
        mIvDay14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (MainActivity.mDatabaseDate.getList_Id().size() > 13) {

                playing=false;
                if(mediaPlayer!=null) {
                    mediaPlayer.stop();
                    mediaPlayer.release();
                    mediaPlayer = null;
                }

                play(MainActivity.mDatabase.getCvList_Id().get(13).getPath());
            }}
        });
        mIvDay15.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (MainActivity.mDatabaseDate.getList_Id().size() > 14) {

                playing=false;
                if(mediaPlayer!=null) {
                    mediaPlayer.stop();
                    mediaPlayer.release();
                    mediaPlayer = null;
                }
                play(MainActivity.mDatabase.getCvList_Id().get(14).getPath());
            }}
        });
        mIvDay16.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (MainActivity.mDatabaseDate.getList_Id().size() > 15) {

                playing=false;
                if(mediaPlayer!=null) {
                    mediaPlayer.stop();
                    mediaPlayer.release();
                    mediaPlayer = null;
                }

                play(MainActivity.mDatabase.getCvList_Id().get(15).getPath());
            }}
        });
        mIvDay17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (MainActivity.mDatabaseDate.getList_Id().size() > 16) {

                playing=false;
                if(mediaPlayer!=null) {
                    mediaPlayer.stop();
                    mediaPlayer.release();
                    mediaPlayer = null;
                }
                play(MainActivity.mDatabase.getCvList_Id().get(16).getPath());
            }}
        });
        mIvDay18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (MainActivity.mDatabaseDate.getList_Id().size() > 17) {

                playing=false;
                if(mediaPlayer!=null) {
                    mediaPlayer.stop();
                    mediaPlayer.release();
                    mediaPlayer = null;
                }
                play(MainActivity.mDatabase.getCvList_Id().get(17).getPath());
            }}
        });
        mIvDay19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (MainActivity.mDatabaseDate.getList_Id().size() > 18) {

                playing=false;
                if(mediaPlayer!=null) {
                    mediaPlayer.stop();
                    mediaPlayer.release();
                    mediaPlayer = null;
                }
                play(MainActivity.mDatabase.getCvList_Id().get(18).getPath());
            }}
        });
        mIvDay20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (MainActivity.mDatabaseDate.getList_Id().size() > 19) {

                playing=false;
                if(mediaPlayer!=null) {
                    mediaPlayer.stop();
                    mediaPlayer.release();
                    mediaPlayer = null;
                }
                play(MainActivity.mDatabase.getCvList_Id().get(19).getPath());
            }}
        });

        mIvPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mediaPlayer != null) {
                    if (playing) {

                        mediaPlayer.pause();
                        duration = mediaPlayer.getCurrentPosition();
                        mIvPlay.setImageResource(R.drawable.play);
                        playing = false;
                    } else {
                        //     mediaPlayer = new MediaPlayer();
                        mediaPlayer.seekTo(duration);
                        mediaPlayer.start();
                        mIvPlay.setImageResource(R.drawable.pause);
                        playing = true;
                    }
                }else{
                    Toast.makeText(getApplicationContext(),"Select audio",Toast.LENGTH_SHORT).show();
                }
            }
        });
        mIvFast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mediaPlayer != null) {
                    if (playing) {
                        mediaPlayer.pause();
                        duration = mediaPlayer.getCurrentPosition()+1000;
                        mediaPlayer.seekTo(duration);
                        mediaPlayer.start();

                    }
                }
            }
        });

        mIvSlow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mediaPlayer != null) {
                    if (playing) {
                        mediaPlayer.pause();
                        duration = mediaPlayer.getCurrentPosition()-1000;
                        mediaPlayer.seekTo(duration);
                        mediaPlayer.start();

                    }
                }
            }
        });

        mIvBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (playing) {
                    mediaPlayer.pause();
                    duration =0;
                    mediaPlayer.seekTo(duration);
                    mediaPlayer.start();

                }
            }

        });

        mIvNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (playing) {
                    mediaPlayer.pause();
                    duration = mediaPlayer.getDuration();
                    mediaPlayer.seekTo(duration);
                    mediaPlayer.start();
                    mIvPlay.setImageResource(R.drawable.play);
                    playing=false;
                    mediaPlayer=null;
                }
            }

        });
    }

    private void initComponents() {

        mBStartHome = (Button) findViewById(R.id.buttonHome);
        mIvDay1 = (TextView) findViewById(R.id.textViewDay1);
        mIvDay2 = (TextView) findViewById(R.id.textViewDay2);
        mIvDay3 = (TextView) findViewById(R.id.textViewDay3);
        mIvDay4 = (TextView) findViewById(R.id.textViewDay4);
        mIvDay5 = (TextView) findViewById(R.id.textViewDay5);
        mIvDay6 = (TextView) findViewById(R.id.textViewDay6);
        mIvDay7 = (TextView) findViewById(R.id.textViewday7);
        mIvDay8 = (TextView) findViewById(R.id.textViewday8);
        mIvDay9 = (TextView) findViewById(R.id.textViewday9);
        mIvDay10 = (TextView) findViewById(R.id.textViewday10);

        mIvDay11 = (TextView) findViewById(R.id.textViewDay11);
        mIvDay12 = (TextView) findViewById(R.id.textViewDay12);
        mIvDay13 = (TextView) findViewById(R.id.textViewday13);
        mIvDay14 = (TextView) findViewById(R.id.textViewday14);
        mIvDay15 = (TextView) findViewById(R.id.textViewday15);
        mIvDay16 = (TextView) findViewById(R.id.textViewday16);
        mIvDay17 = (TextView) findViewById(R.id.textViewday17);
        mIvDay18 = (TextView) findViewById(R.id.textViewday18);
        mIvDay19 = (TextView) findViewById(R.id.textViewday19);
        mIvDay20 = (TextView) findViewById(R.id.textViewday20);

        mIvPlay = (ImageView) findViewById(R.id.imageViewPlay);
        mIvPlay = (ImageView) findViewById(R.id.imageViewPlay);
        mIvFast = (ImageView) findViewById(R.id.imageViewFast);
        mIvSlow = (ImageView) findViewById(R.id.imageViewSlow);
        mIvNext = (ImageView) findViewById(R.id.imageViewNext);
        mIvBack = (ImageView) findViewById(R.id.imageViewBack);

        if (MainActivity.mDatabaseDate.getList_Id().size() > 0) {
            mIvDay1.setTextColor(getResources().getColor(R.color.text_yellow));
            if (MainActivity.mDatabaseDate.getList_Id().size() > 1) {
                mIvDay2.setTextColor(getResources().getColor(R.color.text_yellow));
                if (MainActivity.mDatabaseDate.getList_Id().size() > 2) {
                    mIvDay3.setTextColor(getResources().getColor(R.color.text_yellow));
                    if (MainActivity.mDatabaseDate.getList_Id().size() > 3) {
                        mIvDay4.setTextColor(getResources().getColor(R.color.text_yellow));
                        if (MainActivity.mDatabaseDate.getList_Id().size() > 4) {
                            mIvDay5.setTextColor(getResources().getColor(R.color.text_yellow));
                            if (MainActivity.mDatabaseDate.getList_Id().size() > 5) {
                                mIvDay6.setTextColor(getResources().getColor(R.color.text_yellow));
                                if (MainActivity.mDatabaseDate.getList_Id().size() > 6) {
                                    mIvDay7.setTextColor(getResources().getColor(R.color.text_yellow));
                                    if (MainActivity.mDatabaseDate.getList_Id().size() > 7) {
                                        mIvDay8.setTextColor(getResources().getColor(R.color.text_yellow));
                                        if (MainActivity.mDatabaseDate.getList_Id().size() > 8) {
                                            mIvDay9.setTextColor(getResources().getColor(R.color.text_yellow));
                                            if (MainActivity.mDatabaseDate.getList_Id().size() > 9) {
                                                mIvDay10.setTextColor(getResources().getColor(R.color.text_yellow));
                                                if (MainActivity.mDatabaseDate.getList_Id().size() > 10) {
                                                    mIvDay11.setTextColor(getResources().getColor(R.color.text_yellow));
                                                    if (MainActivity.mDatabaseDate.getList_Id().size() > 11) {
                                                        mIvDay12.setTextColor(getResources().getColor(R.color.text_yellow));
                                                        if (MainActivity.mDatabaseDate.getList_Id().size() > 12) {
                                                            mIvDay13.setTextColor(getResources().getColor(R.color.text_yellow));
                                                            if (MainActivity.mDatabaseDate.getList_Id().size() > 13) {
                                                                mIvDay14.setTextColor(getResources().getColor(R.color.text_yellow));
                                                                if (MainActivity.mDatabaseDate.getList_Id().size() > 14) {
                                                                    mIvDay15.setTextColor(getResources().getColor(R.color.text_yellow));
                                                                    if (MainActivity.mDatabaseDate.getList_Id().size() > 15) {
                                                                        mIvDay16.setTextColor(getResources().getColor(R.color.text_yellow));
                                                                        if (MainActivity.mDatabaseDate.getList_Id().size() > 16) {
                                                                            mIvDay17.setTextColor(getResources().getColor(R.color.text_yellow));
                                                                            if (MainActivity.mDatabaseDate.getList_Id().size() > 17) {
                                                                                mIvDay18.setTextColor(getResources().getColor(R.color.text_yellow));
                                                                                if (MainActivity.mDatabaseDate.getList_Id().size() > 18) {
                                                                                    mIvDay19.setTextColor(getResources().getColor(R.color.text_yellow));
                                                                                    if (MainActivity.mDatabaseDate.getList_Id().size() > 19) {
                                                                                        mIvDay20.setTextColor(getResources().getColor(R.color.text_yellow));
                                                                                    }}}}}}}}}}}}}}}}}}}}
        }

    public  void play(String path) {


        if (!playing) {
            mediaPlayer = new MediaPlayer();
            mIvPlay.setImageResource(R.drawable.pause);

            playing = true;
            try {
                mediaPlayer.setDataSource(path);
                mediaPlayer.prepare();
                mediaPlayer.setLooping(false);
            } catch (IOException e) {
                e.printStackTrace();
            }

            mediaPlayer.start();


        } else {
            mediaPlayer.pause();
            mIvPlay.setImageResource(R.drawable.play);
            playing = false;

        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(mediaPlayer!=null){
            mediaPlayer.stop();
            mediaPlayer.release();
        }
        mediaPlayer=null;
    }
}

