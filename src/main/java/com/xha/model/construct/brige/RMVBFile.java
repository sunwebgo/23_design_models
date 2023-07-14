package com.xha.model.construct.brige;

/**
 * 具体实现化
 *
 * @author Xu huaiang
 * @date 2023/07/14
 */
public class RMVBFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("RMVB视频文件：" + fileName);
    }
}
