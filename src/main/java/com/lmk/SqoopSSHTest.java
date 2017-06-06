package com.lmk;

import com.jcabi.ssh.SSH;
import com.jcabi.ssh.Shell;
import com.jcabi.ssh.Shell.Plain;
import java.io.IOException;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by limingkun on 2017/5/6.
 */
public class SqoopSSHTest {

    private static Date dNow;
    private static SimpleDateFormat ft;



    public static void main(String[] args) throws IOException {
        Shell.Plain shell = new Shell.Plain(
                new SSH(
                        "master", 22,
                        "root", "-----BEGIN RSA PRIVATE KEY-----\n" +
                        "MIIEpAIBAAKCAQEA0MGneg+6nPeLik9i0eamTTx+9puYCC3ncBLOYXouO55jKfva\n" +
                        "nuuXOFQXLe6RKv3nJm4Qt+rU6LPicQeDiwQQah/zj8p9aIczpBjcLs3bsWqNL+kB\n" +
                        "2L1Mx1BeJd8HiW9m/Pw15jTgPrx7oP+Nu2u59U4WyABn2cd8pYAmCZFDLpylrEuq\n" +
                        "yEcsZ2eZnph81Sz+bCLfuLg9Tkita00/MPuDF38Ul9vE7WN4AjQbln0e8Oo2x02P\n" +
                        "Agz0DOFSckXD/C58anoyE8SBY5xEtXjXzLCDXjXaJQLiWk92juNqx3I9UrIGsKw6\n" +
                        "Es8/yudbBNMKh0Cb4H5mwW10z87+2/aFNMjv2QIDAQABAoIBABeilU+gkERNUqMq\n" +
                        "McoKDzIXc1iAbUofyGBMAMnQh4OAf0G1nh74FXrvKmCs7gqsDIuxUntAPzLJiw25\n" +
                        "CA+pOiKJ042oI2K+S/58QhGahRElOy79dpQPeq3mT4KCKdxJnKNv+rpBqlHwDR9B\n" +
                        "T860d61qVfH2+csSZu5l/+h9ZdnU9iDmAS21rXqe7EtUQ+J/ruAvxDL5GayHRDIv\n" +
                        "feXPjvLxbIWpvHtbZE4lRius/7h6QtoRAGEEngEbtuxxXGn5nUr9GnrFpuop+peX\n" +
                        "kefHOhePDDmQ4Two7rM68R+sc7vWsDN0CQ9+NyWdo48IKT72vrzEUDmJhyBYu2vh\n" +
                        "ZcIYDHECgYEA7EJia7hA6WccTMk8db6ErzG218FSWYqjAlRtCqYWP5uT+WQX9eIK\n" +
                        "vADqKp7ZRhycCtSKNM9xvoE0HEn7LHoPULJ3COR0HcY53+Xa0V12XxLubKyAau2i\n" +
                        "eUExP0BJgumVjxxVURUaFjWylIvCDcGRmK+D7S4D0pkibKPOmubrUmMCgYEA4jL6\n" +
                        "+jUv96PREJXbkmDrVSq8eZachHv9ai0+UnHdyPyqH8my5epeINV8lA6T2/PXGJ3B\n" +
                        "v/naCQxgV2lIN1doehXF+U0eX3sg0K1RPhK5dMsIXdrejrYoZ9aKaYpHYsRjH99E\n" +
                        "rPmXrRuYppIOFGa8enHfqur8T3vR1zNve8eGK5MCgYAndrM/8QgOtKV6ggayWD+L\n" +
                        "kA9NnMInqMuvwPBx3epLd65Q8xI5hSdr3e8/bUc3ueGqwXPQfHIwcx6ENytYc48J\n" +
                        "WLYfayGmM41JQ/i4DheOq/fdeTb+JXGFNYmHWjKtRl0wCXiK0a6I1TFeNLYWXCX4\n" +
                        "ziCIRq5myCOC6B3DrBzUpwKBgQCTI8R80/JS7X4GguTk0CTlLrqRgTZpO9p5odqj\n" +
                        "eKxjnG/x45t60bzPMPArw1vNPU3TFnO9NILvVdypn7O5RCOTHuy8Ib07MPYEqGlr\n" +
                        "rnRzE8tqegBB5x5bhYRd6PRMvCEaz3p15poSohvnZqTAAqBiKgbrwJXGAm5axXuk\n" +
                        "kgKl/wKBgQDrq2UW3h0pynaouW4LGWZ1b2eevJctLvcoL2ZTUVEarc1kmjqZIwpL\n" +
                        "ETdPA452tV3+SDjb95QveZ1ZWJOZrWnJwxmJJUQW9uNiJdHF4CI0Xc5mDqvxO0W7\n" +
                        "DFZv7XdJwJNJtvlXFyPLh//Z1QwstYY2u6Z0H3aGOKjLYc283w1vZQ==\n" +
                        "-----END RSA PRIVATE KEY-----")
        );

        String result = shell.exec(
                generateExecStr());
        /**
        import
        --connect
        jdbc:mysql://111.207.243.70:3606/video_information_mining
        --username
        root
                --password
        \'cYz#P@ss%w0rd$868\'
                --null-string
        ''
                --table
                iqiyi_movie_info
        --columns
        "id,url,video_name,video_channel,video_area,video_type,language,main_actor,video_director,brief_intro,play_counts"
                --hbase-table
        iqiyi_movie_info
                --hbase-create-table
                --column-family
        o
                --hbase-row-key

         **/
        System.out.println(result);
        /**
        sqoop import "-Dorg.apache.sqoop.splitter.allow_text_splitter=true" --connect jdbc:mysql://111.207.243.70:3606/video_information_mining --username root --password 'cYz#P@ss%w0rd$868' --null-string ' ' --table third_category --hbase-table third_category --hbase-create-table --column-family info --hbase-row-key id
         **/
    }
    private static String generateExecStr() {
        /**
         * import
         --connect
         jdbc:mysql://111.207.243.70:3606/video_information_mining
         --username
         root
         --password
         'cYz#P@ss%w0rd$868'
         --null-string
         ''
         --table
         iqiyi_movie_info
         --columns
         "id,url,video_name,video_channel,video_area,video_type,language,main_actor,video_director,brief_intro,play_counts"
         --hbase-table
         iqiyi_movie_info
         --hbase-create-table
         --column-family
         o
         --hbase-row-key
         id
         */
        StringBuilder sb = new StringBuilder("sqoop import \"-Dorg.apache.sqoop.splitter.allow_text_splitter=true\" ");

        dNow = new Date( );
        ft = new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss");

//        System.out.println("Current Date: " + ft.format(dNow));
        sb.append("--connect").append(" ")
                .append("jdbc:mysql://"+"111.207.243.70"+":"+"3606"+"/"+"video_information_mining").append(" ")
                .append("--username ").append("root").append(" ")
                .append("--password ").append("\'"+"cYz#P@ss%w0rd$868"+"\'").append(" ")
                .append("--null-string ").append("\' \'").append(" ")
                .append("--table ").append("code_library").append(" ")
//                .append("--columns ").append(generateColumns(columns)).append(" ")
                .append("--hbase-table ").append("code_library" + ft.format(dNow)).append(" ")
                .append("--hbase-create-table").append(" ")
                .append("--column-family ").append("info").append(" ")
                .append("--hbase-row-key ").append("item_attribute");
        System.out.println(sb.toString());
        return sb.toString();
    }
}
