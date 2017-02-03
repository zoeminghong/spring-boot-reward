package com.reward.model;

import java.io.Serializable;
import java.util.Date;

public class RewardShareDo implements Serializable {
    private String id;

    // 分享人id(userId)
    private String sharer;

    // 场景id
    private String sceneId;

    // 成功邀请人数(红包被领取次数)
    private Integer count;

    // 分享时间
    private Date shareDate;

    private Date createDate;

    private Date updateDate;

    private Long version;

    private Integer isdeleted;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 返回分享人id(userId)
     * @return 分享人id(userId)
     */
    public String getSharer() {
        return sharer;
    }

    /**
     * 设置分享人id(userId)
     */
    public void setSharer(String sharer) {
        this.sharer = sharer == null ? null : sharer.trim();
    }

    /**
     * 返回场景id
     * @return 场景id
     */
    public String getSceneId() {
        return sceneId;
    }

    /**
     * 设置场景id
     */
    public void setSceneId(String sceneId) {
        this.sceneId = sceneId == null ? null : sceneId.trim();
    }

    /**
     * 返回成功邀请人数(红包被领取次数)
     * @return 成功邀请人数(红包被领取次数)
     */
    public Integer getCount() {
        return count;
    }

    /**
     * 设置成功邀请人数(红包被领取次数)
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * 返回分享时间
     * @return 分享时间
     */
    public Date getShareDate() {
        return shareDate;
    }

    /**
     * 设置分享时间
     */
    public void setShareDate(Date shareDate) {
        this.shareDate = shareDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Integer getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(Integer isdeleted) {
        this.isdeleted = isdeleted;
    }
}