package com.ch.cloth;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.sql.Types;
import java.util.Collections;

public class CodeGenerator {
    public static void main(String[] args) {
        String url = "jdbc:mysql:///cloth_sql";
        String username = "root";
        String password = "123456";
        String moduleName = "sys";
        String mapperLocation = "D:\\x-cloth\\x-admin\\src\\main\\resources\\mapper\\" + moduleName;
        String tables = "account_inf,cloth_type,feed_information,publish_inf";
        FastAutoGenerator.create(url, username, password)
                .globalConfig(builder -> {
                    builder.author("lht") // 设置作者
                            //.enableSwagger() // 开启 swagger 模式
                            //.fileOverride() // 覆盖已生成文件
                            .outputDir("D:\\x-cloth\\x-admin\\src\\main\\java"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.ch.cloth") // 设置父包名
                            .moduleName(moduleName) // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, mapperLocation)); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude(tables) // 设置需要生成的表名
                            .addTablePrefix(""); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
