package cn.tedu.spring.simpleValue.bean;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class SampleBean {
	private Integer id;
	private String tag;
	private String name;
	private Date date;
	private List<String> listData;
	private Set<String> unorderedData;
	private Map<String, Object> mapData;
	private Properties properties;
	private Properties properties2;

	public SampleBean(String tag, String name) {
		this.tag = tag;
		this.name = name;
	}

	public String getTag() {
		return tag;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<String> getListData() {
		return listData;
	}

	public void setListData(List<String> listData) {
		this.listData = listData;
	}

	public Set<String> getUnorderedData() {
		return unorderedData;
	}

	public void setUnorderedData(Set<String> unorderedData) {
		this.unorderedData = unorderedData;
	}

	public Map<String, Object> getMapData() {
		return mapData;
	}

	public void setMapData(Map<String, Object> mapData) {
		this.mapData = mapData;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public Properties getProperties2() {
		return properties2;
	}

	public void setProperties2(Properties properties2) {
		this.properties2 = properties2;
	}

}
