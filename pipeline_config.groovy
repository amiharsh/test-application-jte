jte{
    pipeline_template = "Rollback"
}
libraries{
  maven{
    message = "Hello From Application Template"
    author = "Harsh"
  }
  // custom_pipeline_utils
}

application_environments{
  dev{
    ip_addresses = ["1.1.1.1", "2.2.2.2" ]
  	}
  test{
  	ip_addresses = [ "1.1.1.1", "2.2.2.2" ]}
}

keywords{
    application_name = "WindowsApplication" // Required - Actual Application name (ex. VOR, AMI, BDP, SCP)
    service = "Web" // Required

    // fortify_scan_enabled=false
    // rollback_enabled=true
    // rollback_branch="feature/test1"
}