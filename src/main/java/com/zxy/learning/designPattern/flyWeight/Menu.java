package com.zxy.learning.designPattern.flyWeight;

import java.util.List;

public interface Menu {
	//规定了实现类必须实现设置内外关系的方法
	public void setPersonMenu(String person, List list);
	//规定了实现类必须实现查找外蕴状态对应的内蕴状态的方法
	public List findPersonMenu(String person, List list);

}
