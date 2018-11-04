package com.demo.test;

import java.lang.management.ManagementFactory;  
import java.lang.management.RuntimeMXBean;  
import java.util.logging.Logger;

import javax.management.AttributeNotFoundException;
import javax.management.InstanceNotFoundException;
import javax.management.IntrospectionException;
import javax.management.MBeanException;
import javax.management.MBeanInfo;
import javax.management.MBeanServer;
import javax.management.MalformedObjectNameException;
import javax.management.ObjectName;
import javax.management.ReflectionException;  
  
public class RuntimeMXBeanUtil {  
      
    private static final Logger logger = Logger.getLogger("RuntimeMXBeanUtil");  
      
    private static final RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();  
      
    public static void main(String[] args) {  
          
        logger.info("BootClassPart-->\n"+runtimeMXBean.getBootClassPath());  
        //logger.info("ManagerSpecVersion is "+runtimeMXBean.getManagementSpecVersion());  
        //logger.info("ClassPath is "+runtimeMXBean.getClassPath());  
        //logger.info("Library path is "+runtimeMXBean.getLibraryPath());  
          
        /** 
         * Populate the process ID 
         */  
        logger.info("The PID is "+populateProcessID());  
          
        logger.info("Spec Name is "+runtimeMXBean.getSpecName());  
        logger.info("Spec Vendor is "+runtimeMXBean.getSpecVendor());  
        //logger.info("Spec Version is "+runtimeMXBean.getSpecVersion());  
        //logger.info("Start Time is "+runtimeMXBean.getStartTime());  
        //logger.info("Start Time is "+runtimeMXBean.getStartTime());  
        //logger.info("Update Time is "+runtimeMXBean.getUptime());  
          
        logger.info("VM Name is "+runtimeMXBean.getVmName());  
        logger.info("VM Vendor is "+runtimeMXBean.getVmVendor());  
        logger.info("VM Version is "+runtimeMXBean.getVmVersion());  
          
        /** 
         * Get System Properties 
         */  
        logger.info("System Properties--> "+runtimeMXBean.getSystemProperties());  
          
        //logger.info("Is boot class path supported? "+runtimeMXBean.isBootClassPathSupported());  
        //System.getProperties();  
        //what is the difference between ManagementFactory.getRuntimeMXBean().getSystemProperties() and System.getProperties() ?  
        //The difference is you can use RuntimeMXBean from a remote JVM to obtain its system properties.  
          
        //System.out.println(runtimeMXBean.getSystemProperties().size() == System.getProperties().size());  
          
        //javax.swing.JOptionPane.showConfirmDialog((java.awt.Component) null,  
        //        "The PID is " +populateProcessID() , null, javax.swing.JOptionPane.DEFAULT_OPTION);  
        
        MBeanServer server = ManagementFactory.getPlatformMBeanServer();
        try {
			MBeanInfo info = server.getMBeanInfo(new ObjectName("java.lang:type=ClassLoading"));
			logger.info(info.getDescriptor().toString());
			logger.info(info.getAttributes().toString());
		} catch (IntrospectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstanceNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedObjectNameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ReflectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 通过ClassLoading的ObjectName,查找MBean为管理而公开的属性和操作。
        try {
			System.out.println(server.getAttribute(new ObjectName("java.lang:type=ClassLoading"), "TotalLoadedClassCount").toString());
		} catch (AttributeNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstanceNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedObjectNameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MBeanException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ReflectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  //返回自 Java 虚拟机开始执行到目前已经加载的类的总数。

    }  
      
    private static String populateProcessID()  
    {     
        /* 
         * runtimeMXBean.getName()取得的值包括两个部分：PID和hostname，两者用@连接。 
         */  
        RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();  
        System.out.println(runtimeMXBean.getName());
        return runtimeMXBean.getName().split("@")[0];  
    }  
}  


