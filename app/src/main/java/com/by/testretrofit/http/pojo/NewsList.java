package com.by.testretrofit.http.pojo;

import java.util.List;

/**
 * Created by baiyu on 16/10/18.
 */

public class NewsList {


    /**
     * title :
     * content :
     */

    private List<NewslistBean> newslist;

    public List<NewslistBean> getNewslist() {
        return newslist;
    }

    public void setNewslist(List<NewslistBean> newslist) {
        this.newslist = newslist;
    }

    public static class NewslistBean {
        private String title;
        private String content;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }
}
