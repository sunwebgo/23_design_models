package com.xha.patterns.construct.brige;

/**
 * 抽象化
 *
 * @author Xu huaiang
 * @date 2023/07/14
 */
public abstract class OperatingSystem {
//    声明实现化角色
    protected VideoFile videoFile;

    public OperatingSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    public abstract void play(String fileName);
}
