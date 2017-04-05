package com.liu.control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.liu.biz.IDeptBiz;
import com.liu.biz.IEmpBiz;
import com.liu.pojo.Dept;
import com.liu.pojo.Emp;



@Controller
@RequestMapping("ec")
public class EmpController {
	
	private IEmpBiz empBizImpl;
	private IDeptBiz deptBizImpl;

	@RequestMapping(value="findallemp")
	public String findallemp(Model model){
		System.out.println("查询所有的员工信息");
		List<Emp> emplist = empBizImpl.findall();
		model.addAttribute("emplist", emplist);
		return "emplist";
	}
	
	@RequestMapping(value="addemp")
	public String addEmp(Model model){
		
		List<Dept> deptlist = deptBizImpl.findall();
		model.addAttribute("deptlist", deptlist);
		return "addemp";
	}
	
	/*@RequestMapping(value="checkname",method=RequestMethod.POST)
	public void checkEname(String ename,HttpServletResponse response){
		int count = empBizImpl.countEname(ename);
		boolean flag = count>0?true:false;
		PrintWriter out = null;
		try {
			out = response.getWriter();
			out.print(flag);
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			out.close();
		}
		//return "addemp";
	}*/
	
	
	/*@RequestMapping(value="checkname",method=RequestMethod.POST)
	public @ResponseBody String checkEname(String ename){
		int count = empBizImpl.countEname(ename);
		boolean flag = count>0?true:false;
		return flag+"";
	}*/
	
	@ResponseBody
	@RequestMapping(value="checkname",method=RequestMethod.POST)
	public String checkEname(String ename){
		int count = empBizImpl.countEname(ename);
		boolean flag = count>0?true:false;
		return flag+"";
	}
	
	

	public IEmpBiz getEmpBizImpl() {
		return empBizImpl;
	}

	public void setEmpBizImpl(IEmpBiz empBizImpl) {
		this.empBizImpl = empBizImpl;
	}

	public IDeptBiz getDeptBizImpl() {
		return deptBizImpl;
	}

	public void setDeptBizImpl(IDeptBiz deptBizImpl) {
		this.deptBizImpl = deptBizImpl;
	}
}
