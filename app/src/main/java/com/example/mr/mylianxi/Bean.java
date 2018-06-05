package com.example.mr.mylianxi;

import java.util.List;

/**
 * author:Created by WangZhiQiang on 2018/4/10.
 */

public class Bean {

    /**
     * code : 200
     * msg : success
     * newslist : [{"ctime":"2018-04-10 00:00","title":"40岁大姐假扮90后骗走情郎600万 警方公布嫌疑人照片","description":"凤凰社会","picUrl":"http://d.ifengimg.com/w150_h95/p0.ifengimg.com/fck/2018_15/62a0e528a1be0e1_w640_h1097.jpg","url":"http://news.ifeng.com/a/20180410/57447229_0.shtml"},{"ctime":"2018-04-10 00:00","title":"老教授突然性情大变爱上恶作剧 原来是患了这种病","description":"凤凰社会","picUrl":"http://d.ifengimg.com/w150_h95/p0.ifengimg.com/pmop/2018/0410/851A4AD80F48DD558C04F63FAECD81959C9BE28B_size90_w300_h399.jpeg","url":"http://news.ifeng.com/a/20180410/57441195_0.shtml"},{"ctime":"2018-04-10 00:00","title":"杜特尔特来博鳌，要帮10万菲律宾教师找工作","description":"凤凰社会","picUrl":"http://d.ifengimg.com/w150_h95/p1.ifengimg.com/fck/2018_15/b24cf0188187e3a_w400_h320.jpg","url":"http://news.ifeng.com/a/20180410/57441287_0.shtml"},{"ctime":"2018-04-10 00:00","title":"广东：酒驾、闯红灯将影响贷款和买房","description":"凤凰社会","picUrl":"http://d.ifengimg.com/w150_h95/p1.ifengimg.com/fck/2018_15/b24cf0188187e3a_w400_h320.jpg","url":"http://news.ifeng.com/a/20180410/57440944_0.shtml"},{"ctime":"2018-04-10 00:00","title":"乱！\u201c黑外教\u201d学历全造假 家长只认外国脸","description":"凤凰社会","picUrl":"http://d.ifengimg.com/w150_h95/p1.ifengimg.com/fck/2018_15/b24cf0188187e3a_w400_h320.jpg","url":"http://news.ifeng.com/a/20180410/57439535_0.shtml"},{"ctime":"2018-04-09 00:00","title":"去世小夫妻遗留受精胚胎 4老人寻求代孕最终产子","description":"凤凰社会","picUrl":"http://d.ifengimg.com/w150_h95/p3.ifengimg.com/a/2018_15/0323ae989c33ed2_size32_w640_h422.jpg","url":"http://news.ifeng.com/a/20180409/57438737_0.shtml"},{"ctime":"2018-04-10 00:00","title":"钱宝集资人非法维权内幕：血本无归后听信谣言","description":"凤凰社会","picUrl":"http://d.ifengimg.com/w150_h95/p0.ifengimg.com/pmop/2018/0409/9161EF8F01C9703FEA9FE7285C6143428A27BE89_size73_w1080_h810.jpeg","url":"http://news.ifeng.com/a/20180410/57438901_0.shtml"},{"ctime":"2018-04-09 00:00","title":"妈妈女友同落水先救谁？高校女教师：先救女友违法","description":"凤凰社会","picUrl":"http://d.ifengimg.com/w150_h95/p3.ifengimg.com/a/2018_15/0323ae989c33ed2_size32_w640_h422.jpg","url":"http://news.ifeng.com/a/20180409/57438185_0.shtml"},{"ctime":"2018-04-09 00:00","title":"九旬老人无法取老伴30万遗款 银行：先办继承公证","description":"凤凰社会","picUrl":"http://d.ifengimg.com/w150_h95/p3.ifengimg.com/a/2018_15/58bb75ea151e3c0_size41_w400_h302.jpg","url":"http://news.ifeng.com/a/20180409/57437996_0.shtml"},{"ctime":"2018-04-09 00:00","title":"扇巴掌、踢肚子、鞋刷抽孩子 又一家\u201c豫章书院\u201d出现","description":"凤凰社会","picUrl":"http://d.ifengimg.com/w150_h95/p3.ifengimg.com/fck/2018_15/54ac747712a3601_w353_h269.jpg","url":"http://news.ifeng.com/a/20180409/57438051_0.shtml"}]
     */

    private int code;
    private String msg;
    private List<NewslistBean> newslist;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<NewslistBean> getNewslist() {
        return newslist;
    }

    public void setNewslist(List<NewslistBean> newslist) {
        this.newslist = newslist;
    }

    public static class NewslistBean {
        /**
         * ctime : 2018-04-10 00:00
         * title : 40岁大姐假扮90后骗走情郎600万 警方公布嫌疑人照片
         * description : 凤凰社会
         * picUrl : http://d.ifengimg.com/w150_h95/p0.ifengimg.com/fck/2018_15/62a0e528a1be0e1_w640_h1097.jpg
         * url : http://news.ifeng.com/a/20180410/57447229_0.shtml
         */

        private String ctime;
        private String title;
        private String description;
        private String picUrl;
        private String url;

        public String getCtime() {
            return ctime;
        }

        public void setCtime(String ctime) {
            this.ctime = ctime;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getPicUrl() {
            return picUrl;
        }

        public void setPicUrl(String picUrl) {
            this.picUrl = picUrl;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
