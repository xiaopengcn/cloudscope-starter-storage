package cn.cloudscope.oss.bean;

import lombok.Data;

/**
 * 上传文件后返回的结果
 * Created by wupanhua on 2018/9/11.
 */
@Data
public class UploadResult {

    /**
     * 文件路径
     */
    private String phyPath;
    /**
     * 文件名称
     */
    private String fileName;
    /**
     * 缩略图地址，如果当前文件为图片则有缩略图
     */
    private String thumbnail;

    public UploadResult() {
    }

    public UploadResult(String phyPath, String fileName) {
        this.phyPath = phyPath;
        this.fileName = fileName;
    }

    /**
     * 创建一个返回对象
     * @param pp
     * @param fn
     * @return
     */
    public static UploadResult createResult(String pp, String fn) {
        return new UploadResult(pp, fn);
    }

    /**
     * 创建图片返回类型
     * @param phyPath
     * @param thumbnail
     * @return
     */
    public static UploadResult createThumbnailResult(String phyPath, String thumbnail) {
        UploadResult uploadResult = new UploadResult();
        uploadResult.setPhyPath(phyPath);
        uploadResult.setThumbnail(thumbnail);

        return uploadResult;
    }

    public static final UploadResult EMPTY = new UploadResult();
}