package com.yyxx.wechatfp.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.yyxx.wechatfp.Lang;
import com.yyxx.wechatfp.util.DpUtil;
import com.yyxx.wechatfp.util.StyleUtil;
import com.yyxx.wechatfp.util.UrlUtil;

/**
 * Created by Jason on 2017/9/9.
 */

public class UpdateInfoView extends DialogFrameLayout {

    private String mTitle;
    private TextView mContentTextView;

    public UpdateInfoView(@NonNull Context context) {
        super(context);
        initView(context);
    }

    public UpdateInfoView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initView(context);
    }

    public UpdateInfoView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
    }

    private void initView(Context context) {

        TextView contentTextView = new TextView(context);
        contentTextView.setClickable(true);
        contentTextView.setAutoLinkMask(Linkify.WEB_URLS);
        contentTextView.setTextSize(TypedValue.COMPLEX_UNIT_DIP, StyleUtil.TEXT_SIZE_SMALL);
        contentTextView.setTextColor(StyleUtil.TEXT_COLOR_DEFAULT);

        int defHPadding = DpUtil.dip2px(context, 20);
        contentTextView.setPadding(defHPadding, 0, defHPadding, 0);

        this.addView(contentTextView, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        withNeutralButtonText(Lang.getString(Lang.SKIP_THIS_VERSION));
        withNegativeButtonText(Lang.getString(Lang.CANCEL));
        withPositiveButtonText(Lang.getString(Lang.GOTO_UPDATE_PAGE));

        mContentTextView = contentTextView;
    }

    public void setContent(String text) {
        text = text.replaceAll("(((https|http|ftp|rtsp|mms):\\/\\/)[^\\s]+)", "<a href=\"$1\">$1</a>");
        CharSequence span = getClickableHtml(text);
        mContentTextView.setText(span);
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    @Override
    public String getDialogTitle() {
        return mTitle;
    }

    private void setLinkClickable(final SpannableStringBuilder clickableHtmlBuilder, final URLSpan urlSpan) {
        int start = clickableHtmlBuilder.getSpanStart(urlSpan);
        int end = clickableHtmlBuilder.getSpanEnd(urlSpan);
        int flags = clickableHtmlBuilder.getSpanFlags(urlSpan);
        ClickableSpan clickableSpan = new ClickableSpan() {
            public void onClick(View view) {
                UrlUtil.openUrl(view.getContext(), urlSpan.getURL());
            }
        };
        clickableHtmlBuilder.setSpan(clickableSpan, start, end, flags);
    }

    private CharSequence getClickableHtml(String html) {
        html = html.replace("\n", "<br/>");
        Spanned spannedHtml = Html.fromHtml(html);
        SpannableStringBuilder clickableHtmlBuilder = new SpannableStringBuilder(spannedHtml);
        URLSpan[] urls = clickableHtmlBuilder.getSpans(0, spannedHtml.length(), URLSpan.class);
        for(final URLSpan span : urls) {
            setLinkClickable(clickableHtmlBuilder, span);
        }
        return clickableHtmlBuilder;
    }
}
