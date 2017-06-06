package com.lmk;

/**
 * Created by limingkun on 2017/5/4.
 */
//import org.apache.hadoop.conf.Configuration;
        import org.apache.sqoop.Sqoop;
        import org.apache.sqoop.tool.SqoopTool;
        import org.apache.sqoop.util.OptionsFileUtil;

public class SqoopTest2 {

    private static int importDataFromMysql() throws Exception {
        String[] args = new String[] {
                "--connect","jdbc:mysql://192.168.1.97:3306/mydb",
                "--driver","com.mysql.jdbc.Driver",
                "-username","root",
                "-password","root",
                "--table","user",
                "-m","1",
                "--target-dir","java_import_user"
        };

//        String[] expandArguments = OptionsFileUtil.expandArguments(args);
//
//        SqoopTool tool = SqoopTool.getTool("import");
//
//        Configuration conf = new Configuration();
//        conf.set("fs.default.name", "hdfs://192.168.1.200:9000");//设置HDFS服务地址
//        Configuration loadPlugins = SqoopTool.loadPlugins(conf);
//
//        Sqoop sqoop = new Sqoop((com.cloudera.sqoop.tool.SqoopTool) tool, loadPlugins);
//        return Sqoop.runSqoop(sqoop, expandArguments);
        return -1;
    }

    public static int databaseList() throws Exception {
        String[] args = new String[] {
                "list-databases",
                "--connect","jdbc:mysql://111.207.243.70:3606/",
//                "--driver","com.mysql.jdbc.Driver",
                "--username","root",
                "--password","cYz#P@ss%w0rd$868"
        };
        String[] expandArguments = OptionsFileUtil.expandArguments(args);

//        SqoopTool tool = SqoopTool.getTool("import");

//        Configuration conf = new Configuration();
//        conf.set("fs.default.name", "hdfs://192.168.1.200:9000");//设置HDFS服务地址
//        Configuration loadPlugins = SqoopTool.loadPlugins(conf);

//        Sqoop sqoop = new Sqoop((com.cloudera.sqoop.tool.SqoopTool) tool, loadPlugins);

        int result = Sqoop.runTool(args);
        if (result != 0) {
            throw new RuntimeException("Sqoop failed - return code " + Integer.toString(result));
        }
        return result;
    }
    public static void main(String[] args) throws Exception {
//        importDataFromMysql();
//        databaseList();
        String s = "lmk;ld;";
        String[] ss = s.split(";");

        System.out.println(ss.length);
        for (String str:ss
             ) {
            System.out.println(str);
        }
    }

}