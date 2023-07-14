package com.xha.model.construct.brige;

/**
 * 扩展抽象化
 *
 * @author Xu huaiang
 * @date 2023/07/14
 */
public class Mac extends OperatingSystem{
    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
