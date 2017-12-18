package com.magicsoft.recycler.fragment;

import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.magicsoft.recycler.R;
import com.zhy.changeskin.SkinManager;

import java.io.File;

/**
 * -----------------------------------------------------------------
 * Copyright (C) 2014-2016, by your company, All rights reserved.
 * -----------------------------------------------------------------
 *
 * @File: MenuLeftFragment.java
 * @Author: winding.kiwi.lss
 * @Version: V100R001C01
 * @Create: 2017/12/18 9:20
 * @Changes (from 2017/12/18)
 * -----------------------------------------------------------------
 * 2017/12/18 : Create MenuLeftFragment.java (winding);
 * -----------------------------------------------------------------
 * @description ${DESCRIPTION}
 */

public class MenuLeftFragment extends Fragment implements View.OnClickListener{
    private View mInnerChange01;
    private View mInnerChange02;
    private String mSkinPkgPath = Environment.getExternalStorageDirectory() + File.separator + "night_plugin.apk";//插件所在路径
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.layout_menu,container,false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);

        mInnerChange01 = view.findViewById(R.id.id_rl_innerchange01);
        mInnerChange01.setOnClickListener(this);

        mInnerChange02 = view.findViewById(R.id.id_rl_innerchange02);
        mInnerChange02.setOnClickListener(this);

        view.findViewById(R.id.id_restore).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)//恢复默认点击
            {
                SkinManager.getInstance().removeAnySkin();
            }
        });

        view.findViewById(R.id.id_changeskin).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)//插件式换肤一点击
            {
               SkinManager.getInstance().changeSkin(mSkinPkgPath, "com.zhy.plugin", new com.zhy.changeskin.callback.ISkinChangingCallback()
                {
                    @Override
                    public void onStart()
                    {
                    }

                    @Override
                    public void onError(Exception e)
                    {
                        Toast.makeText(getActivity(), "换肤失败", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onComplete()
                    {
                        Toast.makeText(getActivity(), "换肤成功", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });

    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.id_rl_innerchange01://应用内换肤red
                SkinManager.getInstance().changeSkin("red");
                break;
            case R.id.id_rl_innerchange02://应用内换肤green
                SkinManager.getInstance().changeSkin("green");
                break;
        }
    }
}
