package com.xha.patterns.construct.brige;

/**
 * 扩展抽象化
 *
 * @author Xu huaiang
 * @date 2023/07/14
 */
public class Windows extends OperatingSystem{
    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
