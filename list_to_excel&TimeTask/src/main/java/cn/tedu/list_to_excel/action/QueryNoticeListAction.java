package cn.tedu.list_to_excel.action;

import cn.tedu.list_to_excel.entity.user.TUser;
import cn.tedu.list_to_excel.mapper.user.TUserMapper;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.util.CellRangeAddress;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.*;
@Controller
public class QueryNoticeListAction {
    public static final Logger log = LoggerFactory.getLogger(QueryNoticeListAction.class);
    @Autowired(required = false)
    TUserMapper tUserMapper;

    public void excute(){
        // 查询出的数据列表
        List<TUser> tUsers = tUserMapper.selectAll();
        log.info("tUsers===>"+tUsers);

        //  生成excel表格
        String title = "所有用户列表";
        Map<Integer, String> headMap = new HashMap<Integer, String>();
        headMap.put(0, "用户ID");
        headMap.put(1, "用户名");
        headMap.put(2, "密码");
        headMap.put(3, "盐值");
        headMap.put(4, "电话");
        headMap.put(5, "邮箱");
        headMap.put(6, "性别");
        headMap.put(7, "头像");
        headMap.put(8, "是否已删除");
        headMap.put(9, "创建人");
        headMap.put(10, "创建时间");
        headMap.put(11, "修改人");
        headMap.put(12, "修改时间");

        List<Map<Integer, String>> bodyMapList = new ArrayList<Map<Integer, String>>();
        for (TUser user : tUsers) {
            Map<Integer, String> bodyMap = new HashMap<Integer, String>();
            bodyMap.put(0, user.getUid().toString());
            bodyMap.put(1, user.getUsername());
            bodyMap.put(2, user.getPassword());
            bodyMap.put(3, user.getSalt());
            bodyMap.put(4, user.getPhone());
            bodyMap.put(5, user.getEmail());
            bodyMap.put(6, user.getGender().toString());
            bodyMap.put(7, user.getAvatar());
            bodyMap.put(8, user.getIsDelete().toString());
            bodyMap.put(9, user.getCreatedUser());
            bodyMap.put(10, (new SimpleDateFormat("yyyy-MM-dd")).format(user.getCreatedTime()));
            bodyMap.put(11, user.getModefiedUser());
            bodyMap.put(12, (new SimpleDateFormat("yyyy-MM-dd")).format(user.getModefiedTime()));
            bodyMapList.add(bodyMap);
        }

        //创建文件夹和文件名
        String locDir = "C:/mr/"+(new SimpleDateFormat("yyyy-MM-dd")).format(new Date())+"/";
        File file = new File(locDir);
        if(!file.exists()){
            file.mkdirs();
        }
        String locFle = "noticeInfo_"
                + (new SimpleDateFormat("yyyy-MM-dd")).format(new Date())
                + ".xls";

        String filePath = locDir+locFle;
        createExcelWhitTil(13, title, headMap, bodyMapList, filePath);
    }

    /**
     *
     * @param colNum excel表格总列数
     * @param title excel表格标题
     * @param headMap excel表格表头
     * @param bodyMapList excel表格数据体集合
     * @param filePath 文件名称（含路径）
     */
    private boolean createExcelWhitTil(int colNum, String title, Map<Integer, String> headMap, List<Map<Integer, String>> bodyMapList, String filePath) {

        // 创建工作簿对象
        HSSFWorkbook workbook = new HSSFWorkbook();

        // 创建sheet对象
        String sheetName = "Sheet1";
        HSSFSheet sheet = workbook.createSheet(sheetName);

        //设置列宽度
        sheet.setColumnWidth(0, 3766);
        sheet.setColumnWidth(1, 3766);
        sheet.setColumnWidth(2, 3766);
        sheet.setColumnWidth(3, 3766);
        sheet.setColumnWidth(4, 3766);
        sheet.setColumnWidth(5, 6766);
        sheet.setColumnWidth(6, 6766);
        sheet.setColumnWidth(7, 3766);
        sheet.setColumnWidth(8, 5766);
        sheet.setColumnWidth(9, 5766);
        sheet.setColumnWidth(10, 5766);
        sheet.setColumnWidth(11, 5766);
        sheet.setColumnWidth(12, 5766);
        // 合并单元格，设置表格标题
        sheet.addMergedRegion(new CellRangeAddress(0, 0, 0, colNum - 1));
        // excel内容写入
        // 0.表格标题栏写入
        HSSFCellStyle tabTitleStyle= workbook.createCellStyle();
        tabTitleStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);//设置水平居中
        tabTitleStyle.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);//设置垂直居中
        HSSFFont titleFont =workbook.createFont();//字体对象
        titleFont.setFontName("黑体");
        titleFont.setFontHeightInPoints((short)20);//设置字体大小
        titleFont.setColor(HSSFColor.RED.index);
        tabTitleStyle.setFont(titleFont);
        tabTitleStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);//设置内容居中
        HSSFRow tableTitlerow=sheet.createRow(0);//将表格标题设置在第一行（0）
        HSSFCell titleCell = tableTitlerow.createCell(0);//选中合并后的单元格作为表格标题信息存储的那个单元格
        titleCell.setCellValue(title);//设置表格标题内容
        titleCell.setCellStyle(tabTitleStyle);//为单元格设置样式


        // 1.数据表头写入
        HSSFRow headRow = sheet.createRow(1);
        for (int i = 0; i < colNum; i++) {
            HSSFCell headCell = headRow.createCell(i, HSSFCell.CELL_TYPE_STRING);
            /*设置表头的内容*/
            headCell.setCellValue(new HSSFRichTextString(headMap.get(i)));
            /*定义表头样式对象*/
            HSSFCellStyle headStyle= workbook.createCellStyle();
            headStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);//设置水平居中
            headStyle.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);//设置垂直居中
            headStyle.setBorderBottom(HSSFCellStyle.BORDER_THIN); //下边框
            headStyle.setBorderLeft(HSSFCellStyle.BORDER_THIN);//左边框
            headStyle.setBorderTop(HSSFCellStyle.BORDER_THIN);//上边框
            headStyle.setBorderRight(HSSFCellStyle.BORDER_THIN);//右边框
            HSSFFont headFont =workbook.createFont();//字体对象
            headFont.setFontName("黑体");
            headFont.setFontHeightInPoints((short)12);//设置字体大小
            headFont.setColor(HSSFColor.GREEN.index);
            headStyle.setFont(headFont);
            /*设置表头的样式*/
            headCell.setCellStyle(headStyle);
        }

        // 2.数据内容写入
        Integer bodyLine = 2;// excel数据体初始行数
        for (Map<Integer, String> bodyMap : bodyMapList) {
            HSSFRow bodyRow = sheet.createRow(bodyLine);
            for (int i = 0; i < colNum; i++) {
                HSSFCell bodyCell = bodyRow
                        .createCell(i, HSSFCell.CELL_TYPE_STRING);
                /*设置body的内容*/
                bodyCell.setCellValue(new HSSFRichTextString(bodyMap.get(i)));

                /*定义body样式对象*/
                HSSFCellStyle bodyStyle= workbook.createCellStyle();
                bodyStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);//设置水平居中
                bodyStyle.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);//设置垂直居中
                bodyStyle.setBorderBottom(HSSFCellStyle.BORDER_THIN); //下边框
                bodyStyle.setBorderLeft(HSSFCellStyle.BORDER_THIN);//左边框
                bodyStyle.setBorderTop(HSSFCellStyle.BORDER_THIN);//上边框
                bodyStyle.setBorderRight(HSSFCellStyle.BORDER_THIN);//右边框
                HSSFFont bodyFont =workbook.createFont();//字体对象
                bodyFont.setFontName("宋体");
                bodyFont.setFontHeightInPoints((short)12);//设置字体大小
                bodyStyle.setFont(bodyFont);
                /*设置body的样式*/
                bodyCell.setCellStyle(bodyStyle);

            }
            bodyLine++;
        }

        FileOutputStream out = null;
        log.info("源文件路径---" + filePath);
        try {
            // 生成Excel的文件名
            out = new FileOutputStream(new File(filePath));
            log.info("导入文件输出流");
            workbook.write(out);
            log.info("刷新文件输出流");
            out.flush();
            log.info("关闭文件输出流");
            out.close();
        } catch (Exception e) {
            log.info("文件生成失败", e);
            return false;
        }
        log.info("-------生成excel文件成功------");
        return true;
    }
}
