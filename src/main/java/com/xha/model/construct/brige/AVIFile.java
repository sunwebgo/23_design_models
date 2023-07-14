package com.xha.model.construct.brige;

/**
 * 具体实现化角色
 *
 * @author Xu huaiang
 * @date 2023/07/14
 */
public class AVIFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("avi视频文件：" + fileName);
    }
}
