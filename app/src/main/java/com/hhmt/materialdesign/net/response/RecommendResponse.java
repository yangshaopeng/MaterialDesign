package com.hhmt.materialdesign.net.response;

import java.util.List;

/**
 * author    : yangshaopeng
 * email     : ysp@btomorrow.cn
 * date      : 2017/09/21  15:31
 * desc      : <p> </p>
 * package   : com.hhmt.materialdesign.net.response
 * project   : MaterialDesign
 */

public class RecommendResponse {

    /**
     * is_history : true
     * counts : 1
     * feedList : [{"post_id":13828311,"type":"multi-photo","url":"https://tuchong.com/1107603/13828311/","site_id":"1107603","author_id":"1107603","published_at":"2016-12-11 08:14:40","excerpt":"海纳百川有容乃大,壁立千仞无欲则刚","favorites":537,"comments":27,"delete":false,"update":false,"content":"海纳百川有容乃大,壁立千仞无欲则刚","title":"海纳百川有容乃大","image_count":1,"images":[{"img_id":21522551,"user_id":1107603,"title":"001","excerpt":"","width":2500,"height":1646,"description":""}],"tags":["Kase卡色现金大奖赛","风光","色彩","佳能","自然","江苏"],"event_tags":["Kase卡色现金大奖赛"],"data_type":"post","created_at":"2016-12-11 08:14:40","sites":[],"site":{"site_id":"1107603","type":"user","name":"燕子Photography","domain":"","description":"自然风光摄影师；图虫网资深摄影师；江苏摄影家协会会员；A色艺术摄影教学机构辅导老师；热爱风光摄影和城市建筑摄影（微信：jiangyan-741006）（新浪微博：燕子Photography）","followers":3662,"url":"https://tuchong.com/1107603/","icon":"https://s1.tuchong.com/sites/110/1107603/logo_small.jpg?4","verified":false,"verified_type":0,"verified_reason":"","verifications":0,"verification_list":[]},"recom_type":"","rqt_id":"","is_favorite":false}]
     * message : 添加成功
     * more : true
     * result : SUCCESS
     */

    private boolean is_history;
    private int counts;
    private String message;
    private boolean more;
    private String result;
    private List<FeedListBean> feedList;

    public boolean isIs_history() {
        return is_history;
    }

    public void setIs_history(boolean is_history) {
        this.is_history = is_history;
    }

    public int getCounts() {
        return counts;
    }

    public void setCounts(int counts) {
        this.counts = counts;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isMore() {
        return more;
    }

    public void setMore(boolean more) {
        this.more = more;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public List<FeedListBean> getFeedList() {
        return feedList;
    }

    public void setFeedList(List<FeedListBean> feedList) {
        this.feedList = feedList;
    }

    public static class FeedListBean {
        /**
         * post_id : 13828311
         * type : multi-photo
         * url : https://tuchong.com/1107603/13828311/
         * site_id : 1107603
         * author_id : 1107603
         * published_at : 2016-12-11 08:14:40
         * excerpt : 海纳百川有容乃大,壁立千仞无欲则刚
         * favorites : 537
         * comments : 27
         * delete : false
         * update : false
         * content : 海纳百川有容乃大,壁立千仞无欲则刚
         * title : 海纳百川有容乃大
         * image_count : 1
         * images : [{"img_id":21522551,"user_id":1107603,"title":"001","excerpt":"","width":2500,"height":1646,"description":""}]
         * tags : ["Kase卡色现金大奖赛","风光","色彩","佳能","自然","江苏"]
         * event_tags : ["Kase卡色现金大奖赛"]
         * data_type : post
         * created_at : 2016-12-11 08:14:40
         * sites : []
         * site : {"site_id":"1107603","type":"user","name":"燕子Photography","domain":"","description":"自然风光摄影师；图虫网资深摄影师；江苏摄影家协会会员；A色艺术摄影教学机构辅导老师；热爱风光摄影和城市建筑摄影（微信：jiangyan-741006）（新浪微博：燕子Photography）","followers":3662,"url":"https://tuchong.com/1107603/","icon":"https://s1.tuchong.com/sites/110/1107603/logo_small.jpg?4","verified":false,"verified_type":0,"verified_reason":"","verifications":0,"verification_list":[]}
         * recom_type :
         * rqt_id :
         * is_favorite : false
         */

        private int post_id;
        private String type;
        private String url;
        private String site_id;
        private String author_id;
        private String published_at;
        private String excerpt;
        private int favorites;
        private int comments;
        private boolean delete;
        private boolean update;
        private String content;
        private String title;
        private int image_count;
        private String data_type;
        private String created_at;
        private SiteBean site;
        private String recom_type;
        private String rqt_id;
        private boolean is_favorite;
        private List<ImagesBean> images;
        private List<String> tags;
        private List<String> event_tags;
        private List<?> sites;

        public int getPost_id() {
            return post_id;
        }

        public void setPost_id(int post_id) {
            this.post_id = post_id;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getSite_id() {
            return site_id;
        }

        public void setSite_id(String site_id) {
            this.site_id = site_id;
        }

        public String getAuthor_id() {
            return author_id;
        }

        public void setAuthor_id(String author_id) {
            this.author_id = author_id;
        }

        public String getPublished_at() {
            return published_at;
        }

        public void setPublished_at(String published_at) {
            this.published_at = published_at;
        }

        public String getExcerpt() {
            return excerpt;
        }

        public void setExcerpt(String excerpt) {
            this.excerpt = excerpt;
        }

        public int getFavorites() {
            return favorites;
        }

        public void setFavorites(int favorites) {
            this.favorites = favorites;
        }

        public int getComments() {
            return comments;
        }

        public void setComments(int comments) {
            this.comments = comments;
        }

        public boolean isDelete() {
            return delete;
        }

        public void setDelete(boolean delete) {
            this.delete = delete;
        }

        public boolean isUpdate() {
            return update;
        }

        public void setUpdate(boolean update) {
            this.update = update;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getImage_count() {
            return image_count;
        }

        public void setImage_count(int image_count) {
            this.image_count = image_count;
        }

        public String getData_type() {
            return data_type;
        }

        public void setData_type(String data_type) {
            this.data_type = data_type;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public SiteBean getSite() {
            return site;
        }

        public void setSite(SiteBean site) {
            this.site = site;
        }

        public String getRecom_type() {
            return recom_type;
        }

        public void setRecom_type(String recom_type) {
            this.recom_type = recom_type;
        }

        public String getRqt_id() {
            return rqt_id;
        }

        public void setRqt_id(String rqt_id) {
            this.rqt_id = rqt_id;
        }

        public boolean isIs_favorite() {
            return is_favorite;
        }

        public void setIs_favorite(boolean is_favorite) {
            this.is_favorite = is_favorite;
        }

        public List<ImagesBean> getImages() {
            return images;
        }

        public void setImages(List<ImagesBean> images) {
            this.images = images;
        }

        public List<String> getTags() {
            return tags;
        }

        public void setTags(List<String> tags) {
            this.tags = tags;
        }

        public List<String> getEvent_tags() {
            return event_tags;
        }

        public void setEvent_tags(List<String> event_tags) {
            this.event_tags = event_tags;
        }

        public List<?> getSites() {
            return sites;
        }

        public void setSites(List<?> sites) {
            this.sites = sites;
        }

        public static class SiteBean {
            /**
             * site_id : 1107603
             * type : user
             * name : 燕子Photography
             * domain :
             * description : 自然风光摄影师；图虫网资深摄影师；江苏摄影家协会会员；A色艺术摄影教学机构辅导老师；热爱风光摄影和城市建筑摄影（微信：jiangyan-741006）（新浪微博：燕子Photography）
             * followers : 3662
             * url : https://tuchong.com/1107603/
             * icon : https://s1.tuchong.com/sites/110/1107603/logo_small.jpg?4
             * verified : false
             * verified_type : 0
             * verified_reason :
             * verifications : 0
             * verification_list : []
             */

            private String site_id;
            private String type;
            private String name;
            private String domain;
            private String description;
            private int followers;
            private String url;
            private String icon;
            private boolean verified;
            private int verified_type;
            private String verified_reason;
            private int verifications;
            private List<?> verification_list;

            public String getSite_id() {
                return site_id;
            }

            public void setSite_id(String site_id) {
                this.site_id = site_id;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getDomain() {
                return domain;
            }

            public void setDomain(String domain) {
                this.domain = domain;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public int getFollowers() {
                return followers;
            }

            public void setFollowers(int followers) {
                this.followers = followers;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public boolean isVerified() {
                return verified;
            }

            public void setVerified(boolean verified) {
                this.verified = verified;
            }

            public int getVerified_type() {
                return verified_type;
            }

            public void setVerified_type(int verified_type) {
                this.verified_type = verified_type;
            }

            public String getVerified_reason() {
                return verified_reason;
            }

            public void setVerified_reason(String verified_reason) {
                this.verified_reason = verified_reason;
            }

            public int getVerifications() {
                return verifications;
            }

            public void setVerifications(int verifications) {
                this.verifications = verifications;
            }

            public List<?> getVerification_list() {
                return verification_list;
            }

            public void setVerification_list(List<?> verification_list) {
                this.verification_list = verification_list;
            }
        }

        public static class ImagesBean {
            /**
             * img_id : 21522551
             * user_id : 1107603
             * title : 001
             * excerpt :
             * width : 2500
             * height : 1646
             * description :
             */

            private int img_id;
            private int user_id;
            private String title;
            private String excerpt;
            private int width;
            private int height;
            private String description;

            public int getImg_id() {
                return img_id;
            }

            public void setImg_id(int img_id) {
                this.img_id = img_id;
            }

            public int getUser_id() {
                return user_id;
            }

            public void setUser_id(int user_id) {
                this.user_id = user_id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getExcerpt() {
                return excerpt;
            }

            public void setExcerpt(String excerpt) {
                this.excerpt = excerpt;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }
        }
    }
}
