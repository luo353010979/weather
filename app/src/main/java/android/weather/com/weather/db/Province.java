package android.weather.com.weather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/5/2 0002.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int porvinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getPorvinceCode() {
        return porvinceCode;
    }

    public void setPorvinceCode(int porvinceCode) {
        this.porvinceCode = porvinceCode;
    }
}
