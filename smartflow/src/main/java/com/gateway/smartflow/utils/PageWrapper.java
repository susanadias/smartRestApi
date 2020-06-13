package com.gateway.smartflow.utils;

import org.springframework.data.domain.Page;

import java.util.List;

/**
 * Page Wrapper to organize the metadata into an object.
 *
 * Example: { "content": [T] "metadata": { "size": number returned elements, "number": number of
 * page, "first": boolean is first page, "totalElements": number of total elements, "totalPages":
 * number of total pages, "last": boolean is last page }, }
 *
 */
public class PageWrapper<T> {
    private final Page<T> page;
    private final PageWrapper<T> metadata;

    public PageWrapper(Page<T> page) {
        this.page = page;
        this.metadata = new PageWrapper<>(page);
    }

    public List<T> getContent() {
        return page.getContent();
    }

    public PageWrapper<T> getMetadata() {
        return metadata;
    }

}
