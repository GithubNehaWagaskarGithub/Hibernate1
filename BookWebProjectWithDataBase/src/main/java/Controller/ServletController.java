package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Book;
import Util.InsertData;
@WebServlet("/link1")
public class ServletController extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		double price=Double.parseDouble(req.getParameter("price"));
		
		Book b=new Book();
		b.setId(id);
		b.setName(name);
		b.setPrice(price);
		
		InsertData i1=new InsertData();
		boolean result=i1.addData(b);
		
		if(result)
		{
			System.out.println("Data Inserted");
		}
		else
		{
			System.out.println("Data Not Inserted");
		}
	}
}

