package parser;

import java.util.ArrayList;

/**
 * Created by C91CBQ on 2017/3/14.
 */
public abstract class BaseParser {
    protected abstract String civilFirst(String str);
    protected abstract String civilSecond(String str);
    protected abstract String administrationFirst(String str);
    protected abstract String administrationSecond(String str);
    protected abstract String criminalFirst(String str);
    protected abstract String criminalSecond(String str);
}
