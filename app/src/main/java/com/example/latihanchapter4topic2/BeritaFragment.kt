package com.example.latihanchapter4topic2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.latihanchapter4topic2.databinding.ActivityMainBinding
import com.example.latihanchapter4topic2.databinding.FragmentBeritaBinding

class BeritaFragment : Fragment() {

    lateinit var adapterBerita: BeritaAdapter
    lateinit var binding: FragmentBeritaBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = FragmentBeritaBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var listBerita = arrayListOf(
            Berita("Tech Companies Say Going Private Comes With Benefits", "September 1, 2022 5:30 a.m. ET", R.drawable.berita_twt,
                "Private-equity firms are snapping up public companies at a record pace, a move that can rattle chief information officers as trusted tech vendors come under new management. \n \n" +
                        "Newly private tech firms and their private-equity owners say the change is for the better, partly because the companies can focus on the long term instead of on delivering quarterly profits—although the shift typically comes with some growing pains and concerns.\n \n" +
                        "“One of the biggest risks as a CIO when one of your vendors gets acquired is the product you have: Is that the one that will get killed to cut costs?” said Garrett Bekker, principal research analyst at market-research firm SNP Global Market Intelligence. “Generally you don’t want your vendor to get acquired,” Mr. Bekker said.\n \n" +
                        "“From our standpoint, we know customers and other stakeholders get nervous,” said Monti Saroya, senior managing director and co-head of Vista Equity Partners’ Flagship Fund. Vista said earlier this year that it planned to acquire software company Citrix Systems Inc. in a deal valued at $16.5 billion, including debt, and in early August said it would buy cloud-based tax-management software maker Avalara Inc. for $8.4 billion.\n \n" +
                        "Mr. Saroya said customers’ concerns are typically addressed quickly because Vista focuses on helping its acquisitions scale up their offerings.\n \n" +
                        "“In a private setting, we’re very much more focused on long-term growth and we worry less about quarterly performance,” he said, adding, “The adjustment is actually on mind-set.",
                " Angus Loten"),
            Berita("The White House is Releasing Important Cybersecurity Guidance Today", "September 14, 2022 at 7:12 a.m. EDT",  R.drawable.berita_2,
                "A White House office is publishing guidelines this morning for how federal agencies and government contractors will comply with President Biden’s demand last year that federal systems and vendors meet common cybersecurity standards.\n \n" +
                        "The memo — which The Cybersecurity 202 is first reporting — is perhaps the most-awaited cybersecurity guidance from the Office of Management and Budget (OMB) since Chief Information Security Officer Chris DeRusha joined the Biden administration at the beginning of 2021, he told me.\n \n" +
                        "It stands to affect the security of government systems and therefore the ability of feds to provide services, as well as the process for billions of dollars worth of federal contracts. That, in turn, could pressure any company that might want to do business with the federal government to meet the government standards, as a senior administration official told reporters last year before rolling out Biden’s executive order that spawned today’s memo.\n \n" +
                        "“We’re all using Outlook email. We’re all using Cisco and Juniper routers,” the official said. “So, essentially, by setting those secure software standards, we’re benefiting everybody broadly.”\n \n" +
                        "Besides the memo, OMB is set to publish a blog post this morning from DeRusha.\n \n" +
                        "“The guidance, developed with input from the public and private sector as well as academia, directs agencies to use only software that complies with secure software development standards … and will allow the federal government to quickly identify security gaps when new vulnerabilities are discovered,” he writes.\n \n" +
                        "OMB hasn’t yet broadly shared the final draft with industry, which had expressed some nervousness about how details of the executive order, and today’s memo, might look.",
                "Starks Team"),
            Berita("Brussels Plans to Introduce Cybersecurity Requirements for Connected Devices", "September 15, 2022 at 2:35 PM", R.drawable.berita_3,
                "The European Commission wants to ensure everyday connected appliances are less vulnerable to cyber attacks by mandating manufacturers to strengthen security throughout their whole lifecycles. \n \n" +
                        "The Cyber Resilience Act presented on Thursday in Brussels aims to become a global standard bearer by introducing mandatory cybersecurity requirements for every product with digital elements — also known as the Internet of Things —  and make consumers more informed about the cybersecurity aspect of what they're buying.\n \n" +
                        " 'When it comes to cybersecurity, Europe is only as strong as its weakest link: be it a vulnerable Member State, or an unsafe product along the supply chain,' Commissioner for the Internal Market Thierry Breton said in a statement.\n \n" +
                        "'Computers, phones, household appliances, virtual assistance devices, cars, toys… each and every one of these hundreds of millions of connected products is a potential entry point for a cyberattack. And yet, today most of the hardware and software products are not subject to any cyber security obligations. By introducing cybersecurity by design, the Cyber Resilience Act will help protect Europe's economy and our collective security,\" he added. \n \n" +
                        "According to Commission data, a ransomware attack takes place every 11 seconds. The financial impact of ransomware attacks is estimated at about €20 billion worldwide last year with the global annual cost of cybercrime seen at €5.5 trillion.\n \n" +
                        "The Commission's proposals will oblige manufacturers to take cybersecurity into account when designing and developing their products and to ensure that any vulnerabilities are handled effectively for the expected product lifetime or for a period of five years, whichever is shorter. \n \n" +
                        "They will also have to actively report exploited vulnerabilities and incidents, provide security updates for at least five years and provide consumers with 'clear and understandable instructions' for the use of products with digital elements.\n \n" +
                        "Manufacturers who do not comply with the legislation will either have their products temporarily or permanently removed from the Single Market and/or be slapped with a fine of between 2% and 5% of global turnover.\n \n" +
                        "The proposed legislation will need to be approved by Parliament and Council and come into force two years after the final green light.\n \n" +
                        "The proposal was welcomed as 'really good news for consumers' by Ursula Pachl, deputy director general at The European Consumer Organisation (BEUC), an umbrella consumers' group.\n \n" +
                        "She argued that weak cybersecurity on these connected products including smart door locks, baby monitors and toys as well as connected washing machines and fridges is not only a problem for the individual consumer but 'can even be a big problem for our society, for our economy as such because if something can be hacked, it can easily lead to disruptions of important infrastructure so this is a very important proposal that the Commission has finally put on the table.'\n \n" +
                        "MEP Dr Patrick Breyer (German Pirate Party), who sits on the Committee on Civil Liberties, Justice and Home Affairs, reacted to the Commission's plans by saying 'it is overdue to finally hold commercial manufacturers accountable' to the threat from 'insecure technology.'\n \n" +
                        "But he also said that the proposal 'falls short in some places and goes too far in others' and called for a revision.\n \n" +
                        "'On the one hand, there is a lack of a clear obligation for commercial manufacturers to immediately fix known security gaps. Commercial manufacturers must be held liable for self-inflicted security loopholes in order to make IT security financially worthwhile! On the other hand, the voluntary development of free software is threatened because the same requirements are to be placed on commercial producers and on volunteers,' he explained.\n",
                "Alice Tidey"),
            Berita("Tech war: Why the US Nvidia Chip Ban is a Direct Threat to Beijing’s Artificial Intelligence Ambitions", "September 12, 2022 at 11:00 PM", R.drawable.berita_4, "ByteDance’s enterprise cloud service, Volcengine, has cut the training period for an image-recognition, artificial intelligence (AI) model from 5 days to 3 days; Alibaba Cloud’s Sinian computing platform has beat a Google-held record by recognising 1.078 million images per second in offline scenarios; and China’s largest server maker Inspur’s NF5488A5 model has been hailed as a world-class product in medical image segmentation, speech recognition and natural language processing.\n \n" +
                    "But none of these achievements by China’s most powerful technology players would be possible without the powerful graphic processing units provided by Nvidia Corp, the Santa Clara-based GPU giant that has played a pivotal role in powering China’s progress in AI, data analysis and computing power.\n \n" +
                    "The US government’s sudden decision last month to restrict Nvidia from selling its two most advanced chips, the A100 and the upcoming H100, to clients in China has therefore sent jitters across China’s AI, cloud computing and smart vehicle sectors, as there is no immediate substitute for the Nvidia GPUs that train AI models for autonomous driving, semantic analysis, image recognition, weather variables and big data analysis, according to industry insiders and tech analysts.",
                "Che Pan"),
            Berita("What If the United States Loses the AI Race Against China?", "September 13, 2022 at 3:40 p.m. EDT", R.drawable.berita_5,
                "The new report uses unusually stark language in describing the danger posed by China’s rapid advances in critical technologies such as AI, quantum computing, 5G communications and synthetic biology. In a section titled, “What Does Losing Look Like?” it describes a series of significant consequences for the United States should it fail to meet the Chinese challenge. Among the catalog of horrors:'\n\n" +
                    "“China dominates the economy of the future and captures trillions of dollars’ worth of value generated by the next wave of technologies.” “China uses its techno-economic advantage for political leverage. Nations — including U.S. allies — reliant on China’s tech swing into the PRC’s political orbit.” “Authoritarian regimes sell the case that they are masters of the modern world.” “An open internet is compromised.” “The U.S. military’s technological edge erodes. The PRC annexes Taiwan.” “The PRC cuts off the supply of microelectronics and other critical technology inputs.”\n \n" +
                    "The report’s authors summarize the catastrophic outcome: “In total, this picture amounts to the unraveling of the order the United States and the democratic world built after World War II and a serious challenge to U.S. prosperity. The United States and other democracies would become economically dependent, losing their engines of prosperity and freedom of action in the world. ... Even if only some of this came to pass, the world would be a darker place for the United States and democracy.”\n \n" +
                    "Frightening technology scenarios like this have become increasingly common over the past decade, and they might overstate the extent of China’s advantage. Chinese economic growth is slowing; its tech sector has been shaken by poorly planned government intervention, and its deteriorating demographic position might not support the “China Dream” of dominance that President Xi Jinping has often advanced. But even so, Schmidt told me in a recent interview, China remains “focused on the deeper technologies,” such as AI, that will command the future.\n \n" +
                    "The bleak report doesn’t just summarize the costs of losing. It argues the United States will, in fact, lose this race without changes in government policy to focus attention better on the technology challenge. “The United States still has no process or person responsible for achieving technology advantage,” the report says. “The U.S public-private ecosystem has vast competitive strengths, but they are un-gathered. America needs a plan for mastering the new geometry of innovation to compete.”\n \n" +
                    "William M. “Mac” Thornberry, a former Republican congressman from Texas who was one of four advisers assisting Schmidt, stated the challenge bluntly in an interview: “If we continue on the current path, we lose.” The report, he says, is intended to explain to Americans, “Here’s what losing looks like to you, individually.”\n \n" +
                    "Essentially, the report argues for national “industrial policy” focused on technology, much like the recently passed legislation to support the semiconductor industry in the United Studies. Schmidt argued that the Chips and Science Act, on its own, won’t be sufficient to reclaim the United States’ lead in technology. “China has a Chips Act every year,” Schmidt contended, through continuous government funding for critical projects.\n \n " +
                    "The Schmidt report is the latest wave of a campaign for greater public and private funding in key technologies. Critics have argued that such directed funding for technology would subsidize already profitable companies such as Google and other tech giants. In that sense, critics contend, Schmidt and the other representatives of the tech sector are advancing their industry’s interests, at a time when there are other powerful claims for government support.\n \n " +
                    "The report counters that there’s need for investments that will benefit all Americans by sharpening the nation’s competitive edge and protecting its values. In the technology competition with China, the report argues, “at stake is the future of free societies, open markets, democratic government, and a world order rooted in freedom not coercion.”\n \n" +
                    "In a foreword to the report, former secretary of state Henry Kissinger sounds a “Back to the Future” note. He writes that the report is modeled on a similar bipartisan project he directed in the 1950s, when the U.S. faced a Soviet Union competitive threat. The aim, back then, was to “explain the issues facing our country that may have been hard for the government to tell the American people.”\n \n" +
                    "Whether America is actually losing the technology race against China is hard to say. The value of this report is that it reminds us how severe a price the United States would pay if optimism about its AI future proved to be wrong.",
                "David Ignatius")
        )

        binding.rvBerita.adapter = BeritaAdapter(listBerita)
        binding.rvBerita.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

    }
}