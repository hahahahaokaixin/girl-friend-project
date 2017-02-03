package lesson2;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

/**
 * Created by guoyu on 2017/1/9.
 */
public class ExcelDemo {
    public static void main(String args[]) {
        String filePath = "D:\\BDS\\语料\\工作簿2.xlsx";//C:\\Users\\bappy.GUOYU\\Desktop\\抓取需求\\excel测试.xlsx
        try {
            readSingleXlsx(filePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 读取Excel表格并输出其中的内容
     *
     * @param path:Excel文件所在的路径
     */
    public static void readSingleXlsx(String path) throws Exception {
        //从 path 所指的路径读取文件
        InputStream inputStream = new FileInputStream(path);
        //String text = InputStreamTOString(inputStream);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(inputStream);

        /**
         * 解析 表格，注意 for循环的嵌套
         * */
        try {
            //获取 sheet的数量
            int sheetNum = xssfWorkbook.getNumberOfSheets();
            //对每一个sheet进行循环
            for (int numSheet = 0; numSheet < sheetNum; numSheet++) {
                XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(numSheet);

                //如果这个sheet是NULL，则忽略，进到下一次循环
                if (xssfSheet == null) {
                    continue;
                }

                //对这个sheet中的每一行进行循环，其中xssfSheet.getLastRowNum()取得行数
                for (int rowNum = 0; rowNum <= xssfSheet.getLastRowNum(); rowNum++) {
                    //取得某一行
                    XSSFRow xssfRow = xssfSheet.getRow(rowNum);
                    //如果这一行为null，则忽略
                    if (xssfRow != null) {
                        //输出这一行中第一列的内容，注意，和数组一样，是从0开始取的
                        System.out.println(xssfRow.getCell(0));
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
