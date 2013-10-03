import java.util.EventListener;

/** 
 * @Title: ValueChangeListener.java 
 * @Package  
 * @Description:  
 * @author Mr.Simple bboyfeiyu@gmail.com 
 * @date Apr 5, 2013 2:13:23 PM 
 * @version V1.0 
 */

/**
 * 事件监听类
 * @ClassName: ValueChangeListener 
 * @Description: 
 * @author Mr.Simple 
 * @date Apr 5, 2013 2:13:28 PM 
 *
 */
public class ButtonClickListener implements EventListener {
	/**
	 * 
	 * @Title: ItemClicked 
	 * @Description: 点击事件
	 * @param event    
	 * @return void    
	 * @throws
	 */
	public void ButtonClicked(ButtonClickEvent event ) {
		// 获取事件源
		ButtonDemo source = (ButtonDemo)event.getSource();
		System.out.println("ButtonClickListener__ButtonClicked你点击的是 : " + source.getItemString()) ;
	}
}
  